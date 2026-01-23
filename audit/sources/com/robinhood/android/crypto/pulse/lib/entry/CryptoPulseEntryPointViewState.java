package com.robinhood.android.crypto.pulse.lib.entry;

import bonfire.proto.idl.crypto.p033v1.GetCryptoPulsePreviewResponseDto;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPulseEntryPointViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointViewState;", "", "<init>", "()V", "Gone", "Visible", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointViewState$Gone;", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointViewState$Visible;", "lib-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class CryptoPulseEntryPointViewState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoPulseEntryPointViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoPulseEntryPointViewState() {
    }

    /* compiled from: CryptoPulseEntryPointViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointViewState$Gone;", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Gone extends CryptoPulseEntryPointViewState {
        public static final int $stable = 0;
        public static final Gone INSTANCE = new Gone();

        public boolean equals(Object other) {
            return this == other || (other instanceof Gone);
        }

        public int hashCode() {
            return 57573668;
        }

        public String toString() {
            return "Gone";
        }

        private Gone() {
            super(null);
        }
    }

    /* compiled from: CryptoPulseEntryPointViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointViewState$Visible;", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointViewState;", "title", "", CarResultComposable2.BODY, "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "tapAction", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;", "hasSignedAgreement", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;Z)V", "getTitle", "()Ljava/lang/String;", "getBody", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getTapAction", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;", "getHasSignedAgreement", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Visible extends CryptoPulseEntryPointViewState {
        public static final int $stable = 8;
        private final String body;
        private final boolean hasSignedAgreement;
        private final StringResource subtitle;
        private final GetCryptoPulsePreviewResponseDto.TapActionDto tapAction;
        private final String title;

        public static /* synthetic */ Visible copy$default(Visible visible, String str, String str2, StringResource stringResource, GetCryptoPulsePreviewResponseDto.TapActionDto tapActionDto, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = visible.title;
            }
            if ((i & 2) != 0) {
                str2 = visible.body;
            }
            if ((i & 4) != 0) {
                stringResource = visible.subtitle;
            }
            if ((i & 8) != 0) {
                tapActionDto = visible.tapAction;
            }
            if ((i & 16) != 0) {
                z = visible.hasSignedAgreement;
            }
            boolean z2 = z;
            StringResource stringResource2 = stringResource;
            return visible.copy(str, str2, stringResource2, tapActionDto, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final GetCryptoPulsePreviewResponseDto.TapActionDto getTapAction() {
            return this.tapAction;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasSignedAgreement() {
            return this.hasSignedAgreement;
        }

        public final Visible copy(String title, String body, StringResource subtitle, GetCryptoPulsePreviewResponseDto.TapActionDto tapAction, boolean hasSignedAgreement) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(tapAction, "tapAction");
            return new Visible(title, body, subtitle, tapAction, hasSignedAgreement);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Visible)) {
                return false;
            }
            Visible visible = (Visible) other;
            return Intrinsics.areEqual(this.title, visible.title) && Intrinsics.areEqual(this.body, visible.body) && Intrinsics.areEqual(this.subtitle, visible.subtitle) && Intrinsics.areEqual(this.tapAction, visible.tapAction) && this.hasSignedAgreement == visible.hasSignedAgreement;
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.tapAction.hashCode()) * 31) + Boolean.hashCode(this.hasSignedAgreement);
        }

        public String toString() {
            return "Visible(title=" + this.title + ", body=" + this.body + ", subtitle=" + this.subtitle + ", tapAction=" + this.tapAction + ", hasSignedAgreement=" + this.hasSignedAgreement + ")";
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getBody() {
            return this.body;
        }

        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final GetCryptoPulsePreviewResponseDto.TapActionDto getTapAction() {
            return this.tapAction;
        }

        public final boolean getHasSignedAgreement() {
            return this.hasSignedAgreement;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Visible(String title, String body, StringResource subtitle, GetCryptoPulsePreviewResponseDto.TapActionDto tapAction, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(tapAction, "tapAction");
            this.title = title;
            this.body = body;
            this.subtitle = subtitle;
            this.tapAction = tapAction;
            this.hasSignedAgreement = z;
        }
    }
}
