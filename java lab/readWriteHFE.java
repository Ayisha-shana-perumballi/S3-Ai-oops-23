/* ayisha shana perumballi
s3 CSE AI-23*/

import java.io.*;
class FileReadWriteHFE
{
	public static void main(String[]args)
	{
		String inputFilePath="input.txt";
		String outputFilepath="output.txt";
		try{
		File inputFile=new File(inputFilePath);
		if(inputFile.exists()){
			FileWriter writer=new FileWriter(inputFile);
			writer.write("Hello,this is a sample text for file handling");
			writer.close();
		}
		
		FileReader reader=new FileReader(inputFile);
		StringBuilder content=new StringBuilder();
		int character;
		
		while((character=reader.read())!=-1){
		content.append((char)character);
		}
		reader.close();
		
		FileWriter writer=new FileWriter(outputFilepath);
		writer.write(content.toString());
		writer.close();
		
		System.out.println("file has been read and written successfully");
		}
		catch(IOException e)
		{
			System.out.println("An error occured:" +e.getMessage());
			}catch (Exception e){
			System.out.println("An unexpected error occured:" +e.getMessage());
			}
		}
	}
	
