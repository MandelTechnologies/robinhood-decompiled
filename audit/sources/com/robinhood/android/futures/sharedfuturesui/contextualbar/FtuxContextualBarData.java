package com.robinhood.android.futures.sharedfuturesui.contextualbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: FtuxContextualBarData.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0017B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData;", "Landroid/os/Parcelable;", "description", "", "subText", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType;Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType;)V", "getDescription", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubText", "getPrimaryButton", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType;", "getSecondaryButton", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ButtonType", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public class FtuxContextualBarData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FtuxContextualBarData> CREATOR = new Creator();
    private final Integer description;
    private final ButtonType primaryButton;
    private final ButtonType secondaryButton;
    private final Integer subText;

    /* compiled from: FtuxContextualBarData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<FtuxContextualBarData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FtuxContextualBarData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FtuxContextualBarData(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (ButtonType) parcel.readParcelable(FtuxContextualBarData.class.getClassLoader()), (ButtonType) parcel.readParcelable(FtuxContextualBarData.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FtuxContextualBarData[] newArray(int i) {
            return new FtuxContextualBarData[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.description;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.subText;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeParcelable(this.primaryButton, flags);
        dest.writeParcelable(this.secondaryButton, flags);
    }

    public FtuxContextualBarData(Integer num, Integer num2, ButtonType buttonType, ButtonType buttonType2) {
        this.description = num;
        this.subText = num2;
        this.primaryButton = buttonType;
        this.secondaryButton = buttonType2;
    }

    public /* synthetic */ FtuxContextualBarData(Integer num, Integer num2, ButtonType buttonType, ButtonType buttonType2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, buttonType, (i & 8) != 0 ? null : buttonType2);
    }

    public final Integer getDescription() {
        return this.description;
    }

    public final Integer getSubText() {
        return this.subText;
    }

    public final ButtonType getPrimaryButton() {
        return this.primaryButton;
    }

    public final ButtonType getSecondaryButton() {
        return this.secondaryButton;
    }

    /* compiled from: FtuxContextualBarData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType;", "Landroid/os/Parcelable;", "<init>", "()V", "IconButton", "TextButton", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType$IconButton;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType$TextButton;", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ButtonType implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ ButtonType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ButtonType() {
        }

        /* compiled from: FtuxContextualBarData.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0005J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType$IconButton;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "contentDescription", "", "type", "Lcom/robinhood/compose/bento/component/BentoIconButtons$Type;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ILcom/robinhood/compose/bento/component/BentoIconButtons$Type;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getContentDescription", "()I", "getType", "()Lcom/robinhood/compose/bento/component/BentoIconButtons$Type;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IconButton extends ButtonType {
            public static final int $stable = 0;
            public static final Parcelable.Creator<IconButton> CREATOR = new Creator();
            private final ServerToBentoAssetMapper2 asset;
            private final int contentDescription;
            private final BentoIconButton4.Type type;

            /* compiled from: FtuxContextualBarData.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<IconButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IconButton createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new IconButton(ServerToBentoAssetMapper2.valueOf(parcel.readString()), parcel.readInt(), BentoIconButton4.Type.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IconButton[] newArray(int i) {
                    return new IconButton[i];
                }
            }

            public static /* synthetic */ IconButton copy$default(IconButton iconButton, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, BentoIconButton4.Type type2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    serverToBentoAssetMapper2 = iconButton.asset;
                }
                if ((i2 & 2) != 0) {
                    i = iconButton.contentDescription;
                }
                if ((i2 & 4) != 0) {
                    type2 = iconButton.type;
                }
                return iconButton.copy(serverToBentoAssetMapper2, i, type2);
            }

            /* renamed from: component1, reason: from getter */
            public final ServerToBentoAssetMapper2 getAsset() {
                return this.asset;
            }

            /* renamed from: component2, reason: from getter */
            public final int getContentDescription() {
                return this.contentDescription;
            }

            /* renamed from: component3, reason: from getter */
            public final BentoIconButton4.Type getType() {
                return this.type;
            }

            public final IconButton copy(ServerToBentoAssetMapper2 asset, int contentDescription, BentoIconButton4.Type type2) {
                Intrinsics.checkNotNullParameter(asset, "asset");
                Intrinsics.checkNotNullParameter(type2, "type");
                return new IconButton(asset, contentDescription, type2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IconButton)) {
                    return false;
                }
                IconButton iconButton = (IconButton) other;
                return this.asset == iconButton.asset && this.contentDescription == iconButton.contentDescription && this.type == iconButton.type;
            }

            public int hashCode() {
                return (((this.asset.hashCode() * 31) + Integer.hashCode(this.contentDescription)) * 31) + this.type.hashCode();
            }

            public String toString() {
                return "IconButton(asset=" + this.asset + ", contentDescription=" + this.contentDescription + ", type=" + this.type + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.asset.name());
                dest.writeInt(this.contentDescription);
                dest.writeString(this.type.name());
            }

            public final ServerToBentoAssetMapper2 getAsset() {
                return this.asset;
            }

            public final int getContentDescription() {
                return this.contentDescription;
            }

            public /* synthetic */ IconButton(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, BentoIconButton4.Type type2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, i, (i2 & 4) != 0 ? BentoIconButton4.Type.Primary : type2);
            }

            public final BentoIconButton4.Type getType() {
                return this.type;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconButton(ServerToBentoAssetMapper2 asset, int i, BentoIconButton4.Type type2) {
                super(null);
                Intrinsics.checkNotNullParameter(asset, "asset");
                Intrinsics.checkNotNullParameter(type2, "type");
                this.asset = asset;
                this.contentDescription = i;
                this.type = type2;
            }
        }

        /* compiled from: FtuxContextualBarData.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType$TextButton;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType;", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TextButton extends ButtonType {
            public static final int $stable = StringResource.$stable;
            public static final Parcelable.Creator<TextButton> CREATOR = new Creator();
            private final StringResource label;

            /* compiled from: FtuxContextualBarData.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<TextButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TextButton createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TextButton((StringResource) parcel.readParcelable(TextButton.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TextButton[] newArray(int i) {
                    return new TextButton[i];
                }
            }

            public static /* synthetic */ TextButton copy$default(TextButton textButton, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = textButton.label;
                }
                return textButton.copy(stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getLabel() {
                return this.label;
            }

            public final TextButton copy(StringResource label) {
                Intrinsics.checkNotNullParameter(label, "label");
                return new TextButton(label);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextButton) && Intrinsics.areEqual(this.label, ((TextButton) other).label);
            }

            public int hashCode() {
                return this.label.hashCode();
            }

            public String toString() {
                return "TextButton(label=" + this.label + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.label, flags);
            }

            public final StringResource getLabel() {
                return this.label;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextButton(StringResource label) {
                super(null);
                Intrinsics.checkNotNullParameter(label, "label");
                this.label = label;
            }
        }
    }
}
