package com.robinhood.android.common.emojipicker;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Emoji.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/Emoji;", "", "id", "", "character", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCharacter", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Emoji {
    public static final int $stable = 0;
    private final String character;
    private final String id;
    private final String name;

    public static /* synthetic */ Emoji copy$default(Emoji emoji, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emoji.id;
        }
        if ((i & 2) != 0) {
            str2 = emoji.character;
        }
        if ((i & 4) != 0) {
            str3 = emoji.name;
        }
        return emoji.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCharacter() {
        return this.character;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Emoji copy(String id, String character, String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(character, "character");
        Intrinsics.checkNotNullParameter(name, "name");
        return new Emoji(id, character, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Emoji)) {
            return false;
        }
        Emoji emoji = (Emoji) other;
        return Intrinsics.areEqual(this.id, emoji.id) && Intrinsics.areEqual(this.character, emoji.character) && Intrinsics.areEqual(this.name, emoji.name);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.character.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "Emoji(id=" + this.id + ", character=" + this.character + ", name=" + this.name + ")";
    }

    public Emoji(String id, String character, String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(character, "character");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.character = character;
        this.name = name;
    }

    public final String getId() {
        return this.id;
    }

    public final String getCharacter() {
        return this.character;
    }

    public final String getName() {
        return this.name;
    }
}
