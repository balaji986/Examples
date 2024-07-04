package com.scheduler;
import com.azure.core.util.BinaryData;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobClientBuilder;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobContainerClientBuilder;


public class AzureStorage {

	public static void main(String[] args) {
		// Replace with your connection string
        String connectionString = "DefaultEndpointsProtocol=https;EndpointSuffix=core.windows.net;AccountName=vivaengagestorage1;AccountKey=e5NlK8trHe0yrdejg9fTbQnbWto1+4AQv3zKlt6LJTqnIKBjjhyPsyexKXAjsaaQp6pGDQRC4/PQ+AStevlRIg==;BlobEndpoint=https://vivaengagestorage1.blob.core.windows.net/;FileEndpoint=https://vivaengagestorage1.file.core.windows.net/;QueueEndpoint=https://vivaengagestorage1.queue.core.windows.net/;TableEndpoint=https://vivaengagestorage1.table.core.windows.net/";

        // Create a BlobContainerClient
        BlobContainerClient containerClient = new BlobContainerClientBuilder()
            .connectionString(connectionString)
            .containerName("mycontainer")
            .buildClient();

        // Create the container if it does not exist
        containerClient.create();

        // Create a BlobClient
        BlobClient blobClient = new BlobClientBuilder()
            .connectionString(connectionString)
            .containerName("mycontainer")
            .blobName("myblob")
            .buildClient();

        // Upload a blob to the container
        String data = "Hello, Azure!";
        blobClient.upload(BinaryData.fromString(data));

        System.out.println("Blob uploaded successfully.");

	}

}
