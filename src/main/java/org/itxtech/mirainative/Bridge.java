package org.itxtech.mirainative;

/*
 *
 * Mirai Native
 *
 * Copyright (C) 2020 iTX Technologies
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @author PeratX
 * @website https://github.com/iTXTech/mirai-native
 *
 */
class Bridge{
    public static final int PRI_MSG_SUBTYPE_FRIEND = 11;

    private String dir;

    public Bridge(String dir){
        this.dir = dir;
    }

    public native void loadDynamicLibraries();
    public native void eventStartup();
    public native void eventExit();
    public native void eventEnable();
    public native void eventDisable();
    public native void eventPrivateMessage(int subType, int msgId, long fromAccount, String msg, int font);
}