package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoTextInput.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextInputs;", "", "<init>", "()V", "Icon", "Message", "Size", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.BentoTextInputs, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoTextInput8 {
    public static final int $stable = 0;
    public static final BentoTextInput8 INSTANCE = new BentoTextInput8();

    /* compiled from: BentoTextInput.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon;", "", "<init>", "()V", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "contentDescription", "", "getContentDescription", "()Ljava/lang/String;", "Size24", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoTextInputs$Icon */
    /* loaded from: classes20.dex */
    public static abstract class Icon {
        public static final int $stable = 0;

        public /* synthetic */ Icon(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract ServerToBentoAssetMapper2 getAsset();

        public abstract String getContentDescription();

        /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
        public abstract float mo20742getSizeD9Ej5fM();

        /* compiled from: BentoTextInput.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b\u0017J0\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\b\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "contentDescription", "", "assetTintOverride", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getContentDescription", "()Ljava/lang/String;", "getAssetTintOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "component1", "component2", "component3", "component3-QN2ZGVo", "copy", "copy-t9lfQc4", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.compose.bento.component.BentoTextInputs$Icon$Size24, reason: from toString */
        public static final /* data */ class Size24 extends Icon {
            public static final int $stable = 0;
            private final ServerToBentoAssetMapper2 asset;
            private final Color assetTintOverride;
            private final String contentDescription;

            public /* synthetic */ Size24(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, Color color, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, str, color);
            }

            /* renamed from: copy-t9lfQc4$default, reason: not valid java name */
            public static /* synthetic */ Size24 m20743copyt9lfQc4$default(Size24 size24, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, Color color, int i, Object obj) {
                if ((i & 1) != 0) {
                    serverToBentoAssetMapper2 = size24.asset;
                }
                if ((i & 2) != 0) {
                    str = size24.contentDescription;
                }
                if ((i & 4) != 0) {
                    color = size24.assetTintOverride;
                }
                return size24.m20745copyt9lfQc4(serverToBentoAssetMapper2, str, color);
            }

            /* renamed from: component1, reason: from getter */
            public final ServerToBentoAssetMapper2 getAsset() {
                return this.asset;
            }

            /* renamed from: component2, reason: from getter */
            public final String getContentDescription() {
                return this.contentDescription;
            }

            /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getAssetTintOverride() {
                return this.assetTintOverride;
            }

            /* renamed from: copy-t9lfQc4, reason: not valid java name */
            public final Size24 m20745copyt9lfQc4(ServerToBentoAssetMapper2 asset, String contentDescription, Color assetTintOverride) {
                Intrinsics.checkNotNullParameter(asset, "asset");
                return new Size24(asset, contentDescription, assetTintOverride, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Size24)) {
                    return false;
                }
                Size24 size24 = (Size24) other;
                return this.asset == size24.asset && Intrinsics.areEqual(this.contentDescription, size24.contentDescription) && Intrinsics.areEqual(this.assetTintOverride, size24.assetTintOverride);
            }

            public int hashCode() {
                int iHashCode = this.asset.hashCode() * 31;
                String str = this.contentDescription;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Color color = this.assetTintOverride;
                return iHashCode2 + (color != null ? Color.m6713hashCodeimpl(color.getValue()) : 0);
            }

            public String toString() {
                return "Size24(asset=" + this.asset + ", contentDescription=" + this.contentDescription + ", assetTintOverride=" + this.assetTintOverride + ")";
            }

            @Override // com.robinhood.compose.bento.component.BentoTextInput8.Icon
            /* renamed from: getSize-D9Ej5fM */
            public float mo20742getSizeD9Ej5fM() {
                return C2002Dp.m7995constructorimpl(24);
            }

            public /* synthetic */ Size24(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : color, null);
            }

            @Override // com.robinhood.compose.bento.component.BentoTextInput8.Icon
            public ServerToBentoAssetMapper2 getAsset() {
                return this.asset;
            }

            @Override // com.robinhood.compose.bento.component.BentoTextInput8.Icon
            public String getContentDescription() {
                return this.contentDescription;
            }

            /* renamed from: getAssetTintOverride-QN2ZGVo, reason: not valid java name */
            public final Color m20746getAssetTintOverrideQN2ZGVo() {
                return this.assetTintOverride;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private Size24(ServerToBentoAssetMapper2 asset, String str, Color color) {
                super(null);
                Intrinsics.checkNotNullParameter(asset, "asset");
                this.asset = asset;
                this.contentDescription = str;
                this.assetTintOverride = color;
            }
        }

        private Icon() {
        }
    }

    private BentoTextInput8() {
    }

    /* compiled from: BentoTextInput.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "", "<init>", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "Success", "Error", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Message$Error;", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Message$Success;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoTextInputs$Message */
    /* loaded from: classes20.dex */
    public static abstract class Message {
        public static final int $stable = 0;

        public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getMessage();

        private Message() {
        }

        /* compiled from: BentoTextInput.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextInputs$Message$Success;", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.compose.bento.component.BentoTextInputs$Message$Success, reason: from toString */
        /* loaded from: classes15.dex */
        public static final /* data */ class Success extends Message {
            public static final int $stable = 0;
            private final String message;

            public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.message;
                }
                return success.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Success copy(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Success(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.message, ((Success) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "Success(message=" + this.message + ")";
            }

            @Override // com.robinhood.compose.bento.component.BentoTextInput8.Message
            public String getMessage() {
                return this.message;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }
        }

        /* compiled from: BentoTextInput.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextInputs$Message$Error;", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.compose.bento.component.BentoTextInputs$Message$Error, reason: from toString */
        /* loaded from: classes15.dex */
        public static final /* data */ class Error extends Message {
            public static final int $stable = 0;
            private final String message;

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Error copy(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Error(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "Error(message=" + this.message + ")";
            }

            @Override // com.robinhood.compose.bento.component.BentoTextInput8.Message
            public String getMessage() {
                return this.message;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoTextInput.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextInputs$Size;", "", "<init>", "(Ljava/lang/String;I)V", "Standard", "Hero", "TextArea", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoTextInputs$Size */
    /* loaded from: classes20.dex */
    public static final class Size {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Standard = new Size("Standard", 0);
        public static final Size Hero = new Size("Hero", 1);
        public static final Size TextArea = new Size("TextArea", 2);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{Standard, Hero, TextArea};
        }

        public static EnumEntries<Size> getEntries() {
            return $ENTRIES;
        }

        private Size(String str, int i) {
        }

        static {
            Size[] sizeArr$values = $values();
            $VALUES = sizeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sizeArr$values);
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }
}
