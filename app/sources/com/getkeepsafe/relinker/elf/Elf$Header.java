package com.getkeepsafe.relinker.elf;

import java.io.IOException;

/* loaded from: classes16.dex */
public abstract class Elf$Header {
    public boolean bigEndian;
    public int phentsize;
    public int phnum;
    public long phoff;
    public int shentsize;
    public int shnum;
    public long shoff;
    public int shstrndx;

    /* renamed from: type, reason: collision with root package name */
    public int f9810type;

    public abstract Elf$DynamicStructure getDynamicStructure(long baseOffset, int index) throws IOException;

    public abstract Elf$ProgramHeader getProgramHeader(long index) throws IOException;

    public abstract Elf$SectionHeader getSectionHeader(int index) throws IOException;
}
