package com.robinhood.shared.support.supportchat.p396ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageContent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/support/supportchat/ui/Component;", "", "<init>", "(Ljava/lang/String;I)V", "Image", "Error", "lib-support-chat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.support.supportchat.ui.Component, reason: use source file name */
/* loaded from: classes6.dex */
final class ImageContent3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageContent3[] $VALUES;
    public static final ImageContent3 Image = new ImageContent3("Image", 0);
    public static final ImageContent3 Error = new ImageContent3("Error", 1);

    private static final /* synthetic */ ImageContent3[] $values() {
        return new ImageContent3[]{Image, Error};
    }

    public static EnumEntries<ImageContent3> getEntries() {
        return $ENTRIES;
    }

    private ImageContent3(String str, int i) {
    }

    static {
        ImageContent3[] imageContent3Arr$values = $values();
        $VALUES = imageContent3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(imageContent3Arr$values);
    }

    public static ImageContent3 valueOf(String str) {
        return (ImageContent3) Enum.valueOf(ImageContent3.class, str);
    }

    public static ImageContent3[] values() {
        return (ImageContent3[]) $VALUES.clone();
    }
}
