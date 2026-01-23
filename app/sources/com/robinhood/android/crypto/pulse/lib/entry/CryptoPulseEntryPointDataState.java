package com.robinhood.android.crypto.pulse.lib.entry;

import bonfire.proto.idl.crypto.p033v1.GetCryptoPulsePreviewResponseDto;
import com.robinhood.android.crypto.pulse.lib.format.CryptoPulseUpdatedAtFormatter;
import com.robinhood.librobinhood.data.store.CryptoUsPulseExperiment;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: CryptoPulseEntryPointDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000fR\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDataState;", "", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;", "cryptoPulseExperimentVariant", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto;", "getCryptoPulsePreviewResponseDto", "<init>", "(Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto;)V", "component1", "()Lj$/time/Clock;", "component2", "()Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;", "component3", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto;", "copy", "(Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto;)Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Clock;", "getClock", "Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;", "getCryptoPulseExperimentVariant", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto;", "getGetCryptoPulsePreviewResponseDto", "Lcom/robinhood/utils/resource/StringResource;", "getUpdatedAtRelativeString", "()Lcom/robinhood/utils/resource/StringResource;", "updatedAtRelativeString", "lib-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoPulseEntryPointDataState {
    public static final int $stable = 8;
    private final Clock clock;
    private final CryptoUsPulseExperiment.Variant cryptoPulseExperimentVariant;
    private final GetCryptoPulsePreviewResponseDto getCryptoPulsePreviewResponseDto;

    public static /* synthetic */ CryptoPulseEntryPointDataState copy$default(CryptoPulseEntryPointDataState cryptoPulseEntryPointDataState, Clock clock, CryptoUsPulseExperiment.Variant variant, GetCryptoPulsePreviewResponseDto getCryptoPulsePreviewResponseDto, int i, Object obj) {
        if ((i & 1) != 0) {
            clock = cryptoPulseEntryPointDataState.clock;
        }
        if ((i & 2) != 0) {
            variant = cryptoPulseEntryPointDataState.cryptoPulseExperimentVariant;
        }
        if ((i & 4) != 0) {
            getCryptoPulsePreviewResponseDto = cryptoPulseEntryPointDataState.getCryptoPulsePreviewResponseDto;
        }
        return cryptoPulseEntryPointDataState.copy(clock, variant, getCryptoPulsePreviewResponseDto);
    }

    /* renamed from: component1, reason: from getter */
    public final Clock getClock() {
        return this.clock;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoUsPulseExperiment.Variant getCryptoPulseExperimentVariant() {
        return this.cryptoPulseExperimentVariant;
    }

    /* renamed from: component3, reason: from getter */
    public final GetCryptoPulsePreviewResponseDto getGetCryptoPulsePreviewResponseDto() {
        return this.getCryptoPulsePreviewResponseDto;
    }

    public final CryptoPulseEntryPointDataState copy(Clock clock, CryptoUsPulseExperiment.Variant cryptoPulseExperimentVariant, GetCryptoPulsePreviewResponseDto getCryptoPulsePreviewResponseDto) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cryptoPulseExperimentVariant, "cryptoPulseExperimentVariant");
        return new CryptoPulseEntryPointDataState(clock, cryptoPulseExperimentVariant, getCryptoPulsePreviewResponseDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoPulseEntryPointDataState)) {
            return false;
        }
        CryptoPulseEntryPointDataState cryptoPulseEntryPointDataState = (CryptoPulseEntryPointDataState) other;
        return Intrinsics.areEqual(this.clock, cryptoPulseEntryPointDataState.clock) && this.cryptoPulseExperimentVariant == cryptoPulseEntryPointDataState.cryptoPulseExperimentVariant && Intrinsics.areEqual(this.getCryptoPulsePreviewResponseDto, cryptoPulseEntryPointDataState.getCryptoPulsePreviewResponseDto);
    }

    public int hashCode() {
        int iHashCode = ((this.clock.hashCode() * 31) + this.cryptoPulseExperimentVariant.hashCode()) * 31;
        GetCryptoPulsePreviewResponseDto getCryptoPulsePreviewResponseDto = this.getCryptoPulsePreviewResponseDto;
        return iHashCode + (getCryptoPulsePreviewResponseDto == null ? 0 : getCryptoPulsePreviewResponseDto.hashCode());
    }

    public String toString() {
        return "CryptoPulseEntryPointDataState(clock=" + this.clock + ", cryptoPulseExperimentVariant=" + this.cryptoPulseExperimentVariant + ", getCryptoPulsePreviewResponseDto=" + this.getCryptoPulsePreviewResponseDto + ")";
    }

    public CryptoPulseEntryPointDataState(Clock clock, CryptoUsPulseExperiment.Variant cryptoPulseExperimentVariant, GetCryptoPulsePreviewResponseDto getCryptoPulsePreviewResponseDto) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cryptoPulseExperimentVariant, "cryptoPulseExperimentVariant");
        this.clock = clock;
        this.cryptoPulseExperimentVariant = cryptoPulseExperimentVariant;
        this.getCryptoPulsePreviewResponseDto = getCryptoPulsePreviewResponseDto;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public /* synthetic */ CryptoPulseEntryPointDataState(Clock clock, CryptoUsPulseExperiment.Variant variant, GetCryptoPulsePreviewResponseDto getCryptoPulsePreviewResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(clock, (i & 2) != 0 ? CryptoUsPulseExperiment.Variant.CONTROL : variant, (i & 4) != 0 ? null : getCryptoPulsePreviewResponseDto);
    }

    public final CryptoUsPulseExperiment.Variant getCryptoPulseExperimentVariant() {
        return this.cryptoPulseExperimentVariant;
    }

    public final GetCryptoPulsePreviewResponseDto getGetCryptoPulsePreviewResponseDto() {
        return this.getCryptoPulsePreviewResponseDto;
    }

    public final StringResource getUpdatedAtRelativeString() {
        Instant updated_at;
        GetCryptoPulsePreviewResponseDto getCryptoPulsePreviewResponseDto = this.getCryptoPulsePreviewResponseDto;
        if (getCryptoPulsePreviewResponseDto == null || (updated_at = getCryptoPulsePreviewResponseDto.getUpdated_at()) == null) {
            return StringResource.INSTANCE.invoke("");
        }
        return CryptoPulseUpdatedAtFormatter.updatedAtRelativeString(updated_at, this.clock);
    }
}
