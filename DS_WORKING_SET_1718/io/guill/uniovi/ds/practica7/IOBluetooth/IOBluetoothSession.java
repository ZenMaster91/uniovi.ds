package io.guill.uniovi.ds.practica7.IOBluetooth;

import java.io.*;

import io.guill.uniovi.ds.practica7.IOKit.IOOProtocol;

public class IOBluetoothSession implements IOOProtocol 
{
	public IOBluetoothSession(String device) 
	{
		stringWriter = new StringWriter();
		stringWriter.append("\n--- START Bluetooth [" + device + "]\n");
	}

	public void send(char c) throws IOException 
	{
		stringWriter.append(c);
	}

	public void close() throws IOException 
	{
		System.out.print(stringWriter.toString());
		System.out.println("\n--- END   Bluetooth");
	}

	private StringWriter stringWriter;
}
