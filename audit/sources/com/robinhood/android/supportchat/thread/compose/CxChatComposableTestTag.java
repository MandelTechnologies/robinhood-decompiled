package com.robinhood.android.supportchat.thread.compose;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CxChatComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatComposableTestTag;", "", "<init>", "(Ljava/lang/String;I)V", "TopBar", CryptoTransferSendSavedAddressComposableKt.TestTagBackButton, "Loading", "Error", "ErrorMessage", "RefreshProgressBar", "NoConnectionBanner", "MessageList", "Message", "Banner", "SecondaryBanner", "BannerCta", "SuggestedResponseRow", "SuggestedResponseChip", "SuggestedResponseContent", "SuggestedResponseProgressBar", "BottomControls", "ImagePickerButton", "ImagePickerBottomSheetOption", "CameraBottomSheetOption", "Input", "indexedTestTag", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CxChatComposableTestTag {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CxChatComposableTestTag[] $VALUES;
    public static final CxChatComposableTestTag TopBar = new CxChatComposableTestTag("TopBar", 0);
    public static final CxChatComposableTestTag BackButton = new CxChatComposableTestTag(CryptoTransferSendSavedAddressComposableKt.TestTagBackButton, 1);
    public static final CxChatComposableTestTag Loading = new CxChatComposableTestTag("Loading", 2);
    public static final CxChatComposableTestTag Error = new CxChatComposableTestTag("Error", 3);
    public static final CxChatComposableTestTag ErrorMessage = new CxChatComposableTestTag("ErrorMessage", 4);
    public static final CxChatComposableTestTag RefreshProgressBar = new CxChatComposableTestTag("RefreshProgressBar", 5);
    public static final CxChatComposableTestTag NoConnectionBanner = new CxChatComposableTestTag("NoConnectionBanner", 6);
    public static final CxChatComposableTestTag MessageList = new CxChatComposableTestTag("MessageList", 7);
    public static final CxChatComposableTestTag Message = new CxChatComposableTestTag("Message", 8);
    public static final CxChatComposableTestTag Banner = new CxChatComposableTestTag("Banner", 9);
    public static final CxChatComposableTestTag SecondaryBanner = new CxChatComposableTestTag("SecondaryBanner", 10);
    public static final CxChatComposableTestTag BannerCta = new CxChatComposableTestTag("BannerCta", 11);
    public static final CxChatComposableTestTag SuggestedResponseRow = new CxChatComposableTestTag("SuggestedResponseRow", 12);
    public static final CxChatComposableTestTag SuggestedResponseChip = new CxChatComposableTestTag("SuggestedResponseChip", 13);
    public static final CxChatComposableTestTag SuggestedResponseContent = new CxChatComposableTestTag("SuggestedResponseContent", 14);
    public static final CxChatComposableTestTag SuggestedResponseProgressBar = new CxChatComposableTestTag("SuggestedResponseProgressBar", 15);
    public static final CxChatComposableTestTag BottomControls = new CxChatComposableTestTag("BottomControls", 16);
    public static final CxChatComposableTestTag ImagePickerButton = new CxChatComposableTestTag("ImagePickerButton", 17);
    public static final CxChatComposableTestTag ImagePickerBottomSheetOption = new CxChatComposableTestTag("ImagePickerBottomSheetOption", 18);
    public static final CxChatComposableTestTag CameraBottomSheetOption = new CxChatComposableTestTag("CameraBottomSheetOption", 19);
    public static final CxChatComposableTestTag Input = new CxChatComposableTestTag("Input", 20);

    private static final /* synthetic */ CxChatComposableTestTag[] $values() {
        return new CxChatComposableTestTag[]{TopBar, BackButton, Loading, Error, ErrorMessage, RefreshProgressBar, NoConnectionBanner, MessageList, Message, Banner, SecondaryBanner, BannerCta, SuggestedResponseRow, SuggestedResponseChip, SuggestedResponseContent, SuggestedResponseProgressBar, BottomControls, ImagePickerButton, ImagePickerBottomSheetOption, CameraBottomSheetOption, Input};
    }

    public static EnumEntries<CxChatComposableTestTag> getEntries() {
        return $ENTRIES;
    }

    private CxChatComposableTestTag(String str, int i) {
    }

    static {
        CxChatComposableTestTag[] cxChatComposableTestTagArr$values = $values();
        $VALUES = cxChatComposableTestTagArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cxChatComposableTestTagArr$values);
    }

    public final String indexedTestTag(int index) {
        return name() + "_" + index;
    }

    public static CxChatComposableTestTag valueOf(String str) {
        return (CxChatComposableTestTag) Enum.valueOf(CxChatComposableTestTag.class, str);
    }

    public static CxChatComposableTestTag[] values() {
        return (CxChatComposableTestTag[]) $VALUES.clone();
    }
}
