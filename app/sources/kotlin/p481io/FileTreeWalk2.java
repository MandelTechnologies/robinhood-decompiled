package kotlin.p481io;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FileTreeWalk.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lkotlin/io/FileWalkDirection;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_DOWN", "BOTTOM_UP", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.io.FileWalkDirection, reason: use source file name */
/* loaded from: classes21.dex */
public final class FileTreeWalk2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FileTreeWalk2[] $VALUES;
    public static final FileTreeWalk2 TOP_DOWN = new FileTreeWalk2("TOP_DOWN", 0);
    public static final FileTreeWalk2 BOTTOM_UP = new FileTreeWalk2("BOTTOM_UP", 1);

    private static final /* synthetic */ FileTreeWalk2[] $values() {
        return new FileTreeWalk2[]{TOP_DOWN, BOTTOM_UP};
    }

    public static EnumEntries<FileTreeWalk2> getEntries() {
        return $ENTRIES;
    }

    private FileTreeWalk2(String str, int i) {
    }

    static {
        FileTreeWalk2[] fileTreeWalk2Arr$values = $values();
        $VALUES = fileTreeWalk2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(fileTreeWalk2Arr$values);
    }

    public static FileTreeWalk2 valueOf(String str) {
        return (FileTreeWalk2) Enum.valueOf(FileTreeWalk2.class, str);
    }

    public static FileTreeWalk2[] values() {
        return (FileTreeWalk2[]) $VALUES.clone();
    }
}
