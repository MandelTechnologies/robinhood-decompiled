package com.robinhood.shared.common.screenshot.sharing.p372ui;

import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareScreenshotBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionIcon;", "", "<init>", "()V", "BentoIcon", "Drawable", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionIcon$BentoIcon;", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionIcon$Drawable;", "lib-screenshot-sharing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.screenshot.sharing.ui.ShareOptionIcon, reason: use source file name */
/* loaded from: classes26.dex */
public abstract class ShareScreenshotBottomSheet5 {
    public static final int $stable = 0;

    public /* synthetic */ ShareScreenshotBottomSheet5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ShareScreenshotBottomSheet5() {
    }

    /* compiled from: ShareScreenshotBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionIcon$BentoIcon;", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionIcon;", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "<init>", "(Lcom/robinhood/compose/bento/component/BentoIcons;)V", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-screenshot-sharing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.screenshot.sharing.ui.ShareOptionIcon$BentoIcon, reason: from toString */
    public static final /* data */ class BentoIcon extends ShareScreenshotBottomSheet5 {
        public static final int $stable = BentoIcon4.$stable;
        private final BentoIcon4 icon;

        public static /* synthetic */ BentoIcon copy$default(BentoIcon bentoIcon, BentoIcon4 bentoIcon4, int i, Object obj) {
            if ((i & 1) != 0) {
                bentoIcon4 = bentoIcon.icon;
            }
            return bentoIcon.copy(bentoIcon4);
        }

        /* renamed from: component1, reason: from getter */
        public final BentoIcon4 getIcon() {
            return this.icon;
        }

        public final BentoIcon copy(BentoIcon4 icon) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new BentoIcon(icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BentoIcon) && Intrinsics.areEqual(this.icon, ((BentoIcon) other).icon);
        }

        public int hashCode() {
            return this.icon.hashCode();
        }

        public String toString() {
            return "BentoIcon(icon=" + this.icon + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BentoIcon(BentoIcon4 icon) {
            super(null);
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
        }

        public final BentoIcon4 getIcon() {
            return this.icon;
        }
    }

    /* compiled from: ShareScreenshotBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionIcon$Drawable;", "Lcom/robinhood/shared/common/screenshot/sharing/ui/ShareOptionIcon;", ResourceTypes.DRAWABLE, "", "<init>", "(I)V", "getDrawable", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-screenshot-sharing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.screenshot.sharing.ui.ShareOptionIcon$Drawable, reason: from toString */
    public static final /* data */ class Drawable extends ShareScreenshotBottomSheet5 {
        public static final int $stable = 0;
        private final int drawable;

        public static /* synthetic */ Drawable copy$default(Drawable drawable, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = drawable.drawable;
            }
            return drawable.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDrawable() {
            return this.drawable;
        }

        public final Drawable copy(int drawable) {
            return new Drawable(drawable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Drawable) && this.drawable == ((Drawable) other).drawable;
        }

        public int hashCode() {
            return Integer.hashCode(this.drawable);
        }

        public String toString() {
            return "Drawable(drawable=" + this.drawable + ")";
        }

        public Drawable(int i) {
            super(null);
            this.drawable = i;
        }

        public final int getDrawable() {
            return this.drawable;
        }
    }
}
