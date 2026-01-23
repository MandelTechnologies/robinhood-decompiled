package com.robinhood.android.supportchat.thread.compose;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.supportchat.thread.compose.CxChatTopBar5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: CxChatTopBar.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBarPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBarPreviewProvider$Args;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Args", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatTopBarPreviewProvider, reason: use source file name */
/* loaded from: classes9.dex */
public final class CxChatTopBar4 implements PreviewParameterProvider<Args> {
    public static final int $stable = 0;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<Args> getValues() {
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.AGENT;
        CxChatTopBar5.AvatarStatus avatarStatus = CxChatTopBar5.AvatarStatus.Online;
        CxChatTopBar5.EndButtonStatus endButtonStatus = CxChatTopBar5.EndButtonStatus.Enabled;
        return SequencesKt.sequenceOf(new Args("Title", serverToBentoAssetMapper3, "#997AEC", avatarStatus, endButtonStatus), new Args("Title", serverToBentoAssetMapper3, "#997AEC", CxChatTopBar5.AvatarStatus.Offline, endButtonStatus), new Args("Title", serverToBentoAssetMapper3, "#997AEC", CxChatTopBar5.AvatarStatus.Hidden, endButtonStatus), new Args("Title", serverToBentoAssetMapper3, "#997AEC", avatarStatus, endButtonStatus), new Args("Title", serverToBentoAssetMapper3, "#997AEC", avatarStatus, CxChatTopBar5.EndButtonStatus.Disabled), new Args("Title", serverToBentoAssetMapper3, "#997AEC", avatarStatus, CxChatTopBar5.EndButtonStatus.Hidden), new Args("Title", serverToBentoAssetMapper3, "#997AEC", avatarStatus, CxChatTopBar5.EndButtonStatus.Loading));
    }

    /* compiled from: CxChatTopBar.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBarPreviewProvider$Args;", "", "title", "", "avatarIcon", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "avatarSliverColorHex", "avatarStatus", "Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;", "endButtonStatus", "Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;Ljava/lang/String;Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;)V", "getTitle", "()Ljava/lang/String;", "getAvatarIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "getAvatarSliverColorHex", "getAvatarStatus", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;", "getEndButtonStatus", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatTopBarPreviewProvider$Args, reason: from toString */
    public static final /* data */ class Args {
        public static final int $stable = 0;
        private final ServerToBentoAssetMapper3 avatarIcon;
        private final String avatarSliverColorHex;
        private final CxChatTopBar5.AvatarStatus avatarStatus;
        private final CxChatTopBar5.EndButtonStatus endButtonStatus;
        private final String title;

        public static /* synthetic */ Args copy$default(Args args, String str, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, String str2, CxChatTopBar5.AvatarStatus avatarStatus, CxChatTopBar5.EndButtonStatus endButtonStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.title;
            }
            if ((i & 2) != 0) {
                serverToBentoAssetMapper3 = args.avatarIcon;
            }
            if ((i & 4) != 0) {
                str2 = args.avatarSliverColorHex;
            }
            if ((i & 8) != 0) {
                avatarStatus = args.avatarStatus;
            }
            if ((i & 16) != 0) {
                endButtonStatus = args.endButtonStatus;
            }
            CxChatTopBar5.EndButtonStatus endButtonStatus2 = endButtonStatus;
            String str3 = str2;
            return args.copy(str, serverToBentoAssetMapper3, str3, avatarStatus, endButtonStatus2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final ServerToBentoAssetMapper3 getAvatarIcon() {
            return this.avatarIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAvatarSliverColorHex() {
            return this.avatarSliverColorHex;
        }

        /* renamed from: component4, reason: from getter */
        public final CxChatTopBar5.AvatarStatus getAvatarStatus() {
            return this.avatarStatus;
        }

        /* renamed from: component5, reason: from getter */
        public final CxChatTopBar5.EndButtonStatus getEndButtonStatus() {
            return this.endButtonStatus;
        }

        public final Args copy(String title, ServerToBentoAssetMapper3 avatarIcon, String avatarSliverColorHex, CxChatTopBar5.AvatarStatus avatarStatus, CxChatTopBar5.EndButtonStatus endButtonStatus) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
            Intrinsics.checkNotNullParameter(avatarSliverColorHex, "avatarSliverColorHex");
            Intrinsics.checkNotNullParameter(avatarStatus, "avatarStatus");
            Intrinsics.checkNotNullParameter(endButtonStatus, "endButtonStatus");
            return new Args(title, avatarIcon, avatarSliverColorHex, avatarStatus, endButtonStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.title, args.title) && this.avatarIcon == args.avatarIcon && Intrinsics.areEqual(this.avatarSliverColorHex, args.avatarSliverColorHex) && this.avatarStatus == args.avatarStatus && this.endButtonStatus == args.endButtonStatus;
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.avatarIcon.hashCode()) * 31) + this.avatarSliverColorHex.hashCode()) * 31) + this.avatarStatus.hashCode()) * 31) + this.endButtonStatus.hashCode();
        }

        public String toString() {
            return "Args(title=" + this.title + ", avatarIcon=" + this.avatarIcon + ", avatarSliverColorHex=" + this.avatarSliverColorHex + ", avatarStatus=" + this.avatarStatus + ", endButtonStatus=" + this.endButtonStatus + ")";
        }

        public Args(String title, ServerToBentoAssetMapper3 avatarIcon, String avatarSliverColorHex, CxChatTopBar5.AvatarStatus avatarStatus, CxChatTopBar5.EndButtonStatus endButtonStatus) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
            Intrinsics.checkNotNullParameter(avatarSliverColorHex, "avatarSliverColorHex");
            Intrinsics.checkNotNullParameter(avatarStatus, "avatarStatus");
            Intrinsics.checkNotNullParameter(endButtonStatus, "endButtonStatus");
            this.title = title;
            this.avatarIcon = avatarIcon;
            this.avatarSliverColorHex = avatarSliverColorHex;
            this.avatarStatus = avatarStatus;
            this.endButtonStatus = endButtonStatus;
        }

        public final String getTitle() {
            return this.title;
        }

        public final ServerToBentoAssetMapper3 getAvatarIcon() {
            return this.avatarIcon;
        }

        public final String getAvatarSliverColorHex() {
            return this.avatarSliverColorHex;
        }

        public final CxChatTopBar5.AvatarStatus getAvatarStatus() {
            return this.avatarStatus;
        }

        public final CxChatTopBar5.EndButtonStatus getEndButtonStatus() {
            return this.endButtonStatus;
        }
    }
}
