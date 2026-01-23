package com.robinhood.android.common.emojipicker;

import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmojiGroup.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/EmojiGroup;", "", "title", "", "emojis", "", "Lcom/robinhood/android/common/emojipicker/Emoji;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getEmojis", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EmojiGroup {
    public static final int $stable = 8;
    private final List<Emoji> emojis;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmojiGroup copy$default(EmojiGroup emojiGroup, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emojiGroup.title;
        }
        if ((i & 2) != 0) {
            list = emojiGroup.emojis;
        }
        return emojiGroup.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Emoji> component2() {
        return this.emojis;
    }

    public final EmojiGroup copy(String title, List<Emoji> emojis) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(emojis, "emojis");
        return new EmojiGroup(title, emojis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmojiGroup)) {
            return false;
        }
        EmojiGroup emojiGroup = (EmojiGroup) other;
        return Intrinsics.areEqual(this.title, emojiGroup.title) && Intrinsics.areEqual(this.emojis, emojiGroup.emojis);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.emojis.hashCode();
    }

    public String toString() {
        return "EmojiGroup(title=" + this.title + ", emojis=" + this.emojis + ")";
    }

    public EmojiGroup(String title, List<Emoji> emojis) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(emojis, "emojis");
        this.title = title;
        this.emojis = emojis;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<Emoji> getEmojis() {
        return this.emojis;
    }
}
