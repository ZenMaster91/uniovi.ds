package io.guill.uniovi.ds.practica_7.mejoraInicial.output;

import java.io.*;

public interface Output {
	void send(char c) throws IOException;
	void close() throws IOException;
}