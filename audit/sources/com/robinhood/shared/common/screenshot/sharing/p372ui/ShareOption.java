package com.robinhood.shared.common.screenshot.sharing.p372ui;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareScreenshotBottomSheet.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOption;", "", "icon", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionIcon;", "text", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "action", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction;", "loggingIdentifier", "<init>", "(Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionIcon;Ljava/lang/String;JLcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIcon", "()Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionIcon;", "getText", "()Ljava/lang/String;", "getBackgroundColor-0d7_KjU", "()J", "J", "getAction", "()Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction;", "getLoggingIdentifier", "component1", "component2", "component3", "component3-0d7_KjU", "component4", "component5", "copy", "copy-XO-JAsU", "(Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionIcon;Ljava/lang/String;JLcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionAction;Ljava/lang/String;)Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOption;", "equals", "", "other", "hashCode", "", "toString", "lib-screenshot-sharing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class ShareOption {
    public static final int $stable = 0;
    private final ShareScreenshotBottomSheet2 action;
    private final long backgroundColor;
    private final ShareScreenshotBottomSheet5 icon;
    private final String loggingIdentifier;
    private final String text;

    public /* synthetic */ ShareOption(ShareScreenshotBottomSheet5 shareScreenshotBottomSheet5, String str, long j, ShareScreenshotBottomSheet2 shareScreenshotBottomSheet2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(shareScreenshotBottomSheet5, str, j, shareScreenshotBottomSheet2, str2);
    }

    /* renamed from: copy-XO-JAsU$default, reason: not valid java name */
    public static /* synthetic */ ShareOption m24852copyXOJAsU$default(ShareOption shareOption, ShareScreenshotBottomSheet5 shareScreenshotBottomSheet5, String str, long j, ShareScreenshotBottomSheet2 shareScreenshotBottomSheet2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            shareScreenshotBottomSheet5 = shareOption.icon;
        }
        if ((i & 2) != 0) {
            str = shareOption.text;
        }
        if ((i & 4) != 0) {
            j = shareOption.backgroundColor;
        }
        if ((i & 8) != 0) {
            shareScreenshotBottomSheet2 = shareOption.action;
        }
        if ((i & 16) != 0) {
            str2 = shareOption.loggingIdentifier;
        }
        long j2 = j;
        return shareOption.m24854copyXOJAsU(shareScreenshotBottomSheet5, str, j2, shareScreenshotBottomSheet2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final ShareScreenshotBottomSheet5 getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final ShareScreenshotBottomSheet2 getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* renamed from: copy-XO-JAsU, reason: not valid java name */
    public final ShareOption m24854copyXOJAsU(ShareScreenshotBottomSheet5 icon, String text, long backgroundColor, ShareScreenshotBottomSheet2 action, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        return new ShareOption(icon, text, backgroundColor, action, loggingIdentifier, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareOption)) {
            return false;
        }
        ShareOption shareOption = (ShareOption) other;
        return Intrinsics.areEqual(this.icon, shareOption.icon) && Intrinsics.areEqual(this.text, shareOption.text) && Color.m6707equalsimpl0(this.backgroundColor, shareOption.backgroundColor) && Intrinsics.areEqual(this.action, shareOption.action) && Intrinsics.areEqual(this.loggingIdentifier, shareOption.loggingIdentifier);
    }

    public int hashCode() {
        return (((((((this.icon.hashCode() * 31) + this.text.hashCode()) * 31) + Color.m6713hashCodeimpl(this.backgroundColor)) * 31) + this.action.hashCode()) * 31) + this.loggingIdentifier.hashCode();
    }

    public String toString() {
        return "ShareOption(icon=" + this.icon + ", text=" + this.text + ", backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ", action=" + this.action + ", loggingIdentifier=" + this.loggingIdentifier + ")";
    }

    private ShareOption(ShareScreenshotBottomSheet5 icon, String text, long j, ShareScreenshotBottomSheet2 action, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        this.icon = icon;
        this.text = text;
        this.backgroundColor = j;
        this.action = action;
        this.loggingIdentifier = loggingIdentifier;
    }

    public final ShareScreenshotBottomSheet5 getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m24855getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    public final ShareScreenshotBottomSheet2 getAction() {
        return this.action;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }
}
