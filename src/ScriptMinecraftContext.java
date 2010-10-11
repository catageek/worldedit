
import com.sk89q.worldedit.MaxChangedBlocksException;

// $Id$
/*
 * WorldEdit
 * Copyright (C) 2010 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

/**
 *
 * @author Albert
 */
public class ScriptMinecraftContext {
    private EditSession editSession;

    /**
     * Construct this Minecraft object with an EditSession.
     * 
     * @param editSession
     */
    public ScriptMinecraftContext(EditSession editSession) {
        this.editSession = editSession;
    }
    
    /**
     * Sets the block at position x, y, z with a block type.
     *
     * @param x
     * @param y
     * @param z
     * @param blockType
     * @throws MaxChangedBlocksException
     * @return whether the block was changed
     */
    public boolean setBlock(int x, int y, int z, int blockType)
            throws MaxChangedBlocksException {
        return editSession.setBlock(x, y, z, blockType);
    }

    /**
     * Gets the block type at a position x, y, z.
     *
     * @param x
     * @param y
     * @param z
     * @return block type ID
     */
    public int getBlock(int x, int y, int z) {
        return editSession.getBlock(x, y, z);
    }
}
