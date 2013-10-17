package Zip_Rar_Strategy_Example;

import java.io.File;
import java.util.ArrayList;

//Strategy Interface
public interface CompressionStrategy
{
 public void compressFiles(ArrayList<File> files);
}