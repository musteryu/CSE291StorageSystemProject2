package cse291.lsmdb.io.sstable.blocks;

import cse291.lsmdb.io.interfaces.Block;

import java.io.File;
import java.io.IOException;

/**
 * Created by musteryu on 2017/6/4.
 */
public abstract class AbstractBlock implements Block {
    public static final String DEFAULT_SUFFIX = ".db";
    abstract public File getFile() throws IOException;
    public ComponentFile getComponentFile() throws IOException {
        return new ComponentFile(getFile());
    }
}
