package com.robinhood.android.crypto.pulse.feed;

import bonfire.proto.idl.copilot.p032v1.InstrumentDigestDetailDto;
import bonfire.proto.idl.copilot.p032v1.InstrumentDigestPreviewDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedRefreshResponseDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedResponseDto;
import com.robinhood.android.cortex.contracts.AssetDigestFragmentKey;
import com.robinhood.android.cortex.contracts.AssetDigestValuePropsExperiment2;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.cortex.models.asset.AssetDigest4;
import com.robinhood.android.cortex.models.asset.AssetDigestDetail;
import com.robinhood.android.cortex.models.asset.AssetDigestPreview;
import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.android.crypto.pulse.C12924R;
import com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemState;
import com.robinhood.android.crypto.pulse.lib.format.CryptoPulseUpdatedAtFormatter;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.librobinhood.data.store.CryptoUsPulseExperiment;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayState;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import com.squareup.moshi.Moshi;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.ColorDto;
import rh_server_driven_ui.p531v1.TextDto;

/* compiled from: CryptoPulseFeedDataState.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'Jn\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010!R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b\u000f\u0010#R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010%R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010'R\u0011\u0010E\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010G\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bF\u0010\u001fR\u0013\u0010K\u001a\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020M0L8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0013\u0010T\u001a\u0004\u0018\u00010Q8F¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDataState;", "", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/squareup/moshi/Moshi;", "moshi", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "getCryptoPulseFeedResponseDto", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "getCryptoPulseFeedRefreshResponseDto", "", "rhsAccountNumber", "Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;", "cryptoPulseExperimentVariant", "", "isNotificationEnabled", "Lcom/robinhood/android/cortex/contracts/AssetDigestValuePropsVariant;", "assetDigestValuePropsVariant", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "direction", "<init>", "(Lj$/time/Clock;Lcom/squareup/moshi/Moshi;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;Ljava/lang/String;Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;ZLcom/robinhood/android/cortex/contracts/AssetDigestValuePropsVariant;Lcom/robinhood/models/serverdriven/experimental/api/Direction;)V", "component1", "()Lj$/time/Clock;", "component2", "()Lcom/squareup/moshi/Moshi;", "component3", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "component4", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;", "component7", "()Z", "component8", "()Lcom/robinhood/android/cortex/contracts/AssetDigestValuePropsVariant;", "component9", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "copy", "(Lj$/time/Clock;Lcom/squareup/moshi/Moshi;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;Ljava/lang/String;Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;ZLcom/robinhood/android/cortex/contracts/AssetDigestValuePropsVariant;Lcom/robinhood/models/serverdriven/experimental/api/Direction;)Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedDataState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Clock;", "getClock", "Lcom/squareup/moshi/Moshi;", "getMoshi", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "getGetCryptoPulseFeedResponseDto", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "getGetCryptoPulseFeedRefreshResponseDto", "Ljava/lang/String;", "getRhsAccountNumber", "Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;", "getCryptoPulseExperimentVariant", "Z", "Lcom/robinhood/android/cortex/contracts/AssetDigestValuePropsVariant;", "getAssetDigestValuePropsVariant", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getDirection", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getNotificationIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "notificationIcon", "getTitleText", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitleText", "()Lcom/robinhood/utils/resource/StringResource;", "subtitleText", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState;", "getPulseFeedItemStates", "()Lkotlinx/collections/immutable/ImmutableList;", "pulseFeedItemStates", "Lrh_server_driven_ui/v1/TextDto;", "getDisclosuresTextDto", "()Lrh_server_driven_ui/v1/TextDto;", "disclosuresTextDto", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoPulseFeedDataState {
    public static final int $stable = 8;
    private final AssetDigestValuePropsExperiment2 assetDigestValuePropsVariant;
    private final Clock clock;
    private final CryptoUsPulseExperiment.Variant cryptoPulseExperimentVariant;
    private final Direction direction;
    private final GetCryptoPulseFeedRefreshResponseDto getCryptoPulseFeedRefreshResponseDto;
    private final GetCryptoPulseFeedResponseDto getCryptoPulseFeedResponseDto;
    private final boolean isNotificationEnabled;
    private final Moshi moshi;
    private final String rhsAccountNumber;

    public static /* synthetic */ CryptoPulseFeedDataState copy$default(CryptoPulseFeedDataState cryptoPulseFeedDataState, Clock clock, Moshi moshi, GetCryptoPulseFeedResponseDto getCryptoPulseFeedResponseDto, GetCryptoPulseFeedRefreshResponseDto getCryptoPulseFeedRefreshResponseDto, String str, CryptoUsPulseExperiment.Variant variant, boolean z, AssetDigestValuePropsExperiment2 assetDigestValuePropsExperiment2, Direction direction, int i, Object obj) {
        if ((i & 1) != 0) {
            clock = cryptoPulseFeedDataState.clock;
        }
        if ((i & 2) != 0) {
            moshi = cryptoPulseFeedDataState.moshi;
        }
        if ((i & 4) != 0) {
            getCryptoPulseFeedResponseDto = cryptoPulseFeedDataState.getCryptoPulseFeedResponseDto;
        }
        if ((i & 8) != 0) {
            getCryptoPulseFeedRefreshResponseDto = cryptoPulseFeedDataState.getCryptoPulseFeedRefreshResponseDto;
        }
        if ((i & 16) != 0) {
            str = cryptoPulseFeedDataState.rhsAccountNumber;
        }
        if ((i & 32) != 0) {
            variant = cryptoPulseFeedDataState.cryptoPulseExperimentVariant;
        }
        if ((i & 64) != 0) {
            z = cryptoPulseFeedDataState.isNotificationEnabled;
        }
        if ((i & 128) != 0) {
            assetDigestValuePropsExperiment2 = cryptoPulseFeedDataState.assetDigestValuePropsVariant;
        }
        if ((i & 256) != 0) {
            direction = cryptoPulseFeedDataState.direction;
        }
        AssetDigestValuePropsExperiment2 assetDigestValuePropsExperiment22 = assetDigestValuePropsExperiment2;
        Direction direction2 = direction;
        CryptoUsPulseExperiment.Variant variant2 = variant;
        boolean z2 = z;
        String str2 = str;
        GetCryptoPulseFeedResponseDto getCryptoPulseFeedResponseDto2 = getCryptoPulseFeedResponseDto;
        return cryptoPulseFeedDataState.copy(clock, moshi, getCryptoPulseFeedResponseDto2, getCryptoPulseFeedRefreshResponseDto, str2, variant2, z2, assetDigestValuePropsExperiment22, direction2);
    }

    /* renamed from: component1, reason: from getter */
    public final Clock getClock() {
        return this.clock;
    }

    /* renamed from: component2, reason: from getter */
    public final Moshi getMoshi() {
        return this.moshi;
    }

    /* renamed from: component3, reason: from getter */
    public final GetCryptoPulseFeedResponseDto getGetCryptoPulseFeedResponseDto() {
        return this.getCryptoPulseFeedResponseDto;
    }

    /* renamed from: component4, reason: from getter */
    public final GetCryptoPulseFeedRefreshResponseDto getGetCryptoPulseFeedRefreshResponseDto() {
        return this.getCryptoPulseFeedRefreshResponseDto;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final CryptoUsPulseExperiment.Variant getCryptoPulseExperimentVariant() {
        return this.cryptoPulseExperimentVariant;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsNotificationEnabled() {
        return this.isNotificationEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final AssetDigestValuePropsExperiment2 getAssetDigestValuePropsVariant() {
        return this.assetDigestValuePropsVariant;
    }

    /* renamed from: component9, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    public final CryptoPulseFeedDataState copy(Clock clock, Moshi moshi, GetCryptoPulseFeedResponseDto getCryptoPulseFeedResponseDto, GetCryptoPulseFeedRefreshResponseDto getCryptoPulseFeedRefreshResponseDto, String rhsAccountNumber, CryptoUsPulseExperiment.Variant cryptoPulseExperimentVariant, boolean isNotificationEnabled, AssetDigestValuePropsExperiment2 assetDigestValuePropsVariant, Direction direction) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(getCryptoPulseFeedResponseDto, "getCryptoPulseFeedResponseDto");
        Intrinsics.checkNotNullParameter(getCryptoPulseFeedRefreshResponseDto, "getCryptoPulseFeedRefreshResponseDto");
        Intrinsics.checkNotNullParameter(cryptoPulseExperimentVariant, "cryptoPulseExperimentVariant");
        Intrinsics.checkNotNullParameter(assetDigestValuePropsVariant, "assetDigestValuePropsVariant");
        return new CryptoPulseFeedDataState(clock, moshi, getCryptoPulseFeedResponseDto, getCryptoPulseFeedRefreshResponseDto, rhsAccountNumber, cryptoPulseExperimentVariant, isNotificationEnabled, assetDigestValuePropsVariant, direction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoPulseFeedDataState)) {
            return false;
        }
        CryptoPulseFeedDataState cryptoPulseFeedDataState = (CryptoPulseFeedDataState) other;
        return Intrinsics.areEqual(this.clock, cryptoPulseFeedDataState.clock) && Intrinsics.areEqual(this.moshi, cryptoPulseFeedDataState.moshi) && Intrinsics.areEqual(this.getCryptoPulseFeedResponseDto, cryptoPulseFeedDataState.getCryptoPulseFeedResponseDto) && Intrinsics.areEqual(this.getCryptoPulseFeedRefreshResponseDto, cryptoPulseFeedDataState.getCryptoPulseFeedRefreshResponseDto) && Intrinsics.areEqual(this.rhsAccountNumber, cryptoPulseFeedDataState.rhsAccountNumber) && this.cryptoPulseExperimentVariant == cryptoPulseFeedDataState.cryptoPulseExperimentVariant && this.isNotificationEnabled == cryptoPulseFeedDataState.isNotificationEnabled && this.assetDigestValuePropsVariant == cryptoPulseFeedDataState.assetDigestValuePropsVariant && this.direction == cryptoPulseFeedDataState.direction;
    }

    public int hashCode() {
        int iHashCode = ((((((this.clock.hashCode() * 31) + this.moshi.hashCode()) * 31) + this.getCryptoPulseFeedResponseDto.hashCode()) * 31) + this.getCryptoPulseFeedRefreshResponseDto.hashCode()) * 31;
        String str = this.rhsAccountNumber;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cryptoPulseExperimentVariant.hashCode()) * 31) + Boolean.hashCode(this.isNotificationEnabled)) * 31) + this.assetDigestValuePropsVariant.hashCode()) * 31;
        Direction direction = this.direction;
        return iHashCode2 + (direction != null ? direction.hashCode() : 0);
    }

    public String toString() {
        return "CryptoPulseFeedDataState(clock=" + this.clock + ", moshi=" + this.moshi + ", getCryptoPulseFeedResponseDto=" + this.getCryptoPulseFeedResponseDto + ", getCryptoPulseFeedRefreshResponseDto=" + this.getCryptoPulseFeedRefreshResponseDto + ", rhsAccountNumber=" + this.rhsAccountNumber + ", cryptoPulseExperimentVariant=" + this.cryptoPulseExperimentVariant + ", isNotificationEnabled=" + this.isNotificationEnabled + ", assetDigestValuePropsVariant=" + this.assetDigestValuePropsVariant + ", direction=" + this.direction + ")";
    }

    public CryptoPulseFeedDataState(Clock clock, Moshi moshi, GetCryptoPulseFeedResponseDto getCryptoPulseFeedResponseDto, GetCryptoPulseFeedRefreshResponseDto getCryptoPulseFeedRefreshResponseDto, String str, CryptoUsPulseExperiment.Variant cryptoPulseExperimentVariant, boolean z, AssetDigestValuePropsExperiment2 assetDigestValuePropsVariant, Direction direction) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(getCryptoPulseFeedResponseDto, "getCryptoPulseFeedResponseDto");
        Intrinsics.checkNotNullParameter(getCryptoPulseFeedRefreshResponseDto, "getCryptoPulseFeedRefreshResponseDto");
        Intrinsics.checkNotNullParameter(cryptoPulseExperimentVariant, "cryptoPulseExperimentVariant");
        Intrinsics.checkNotNullParameter(assetDigestValuePropsVariant, "assetDigestValuePropsVariant");
        this.clock = clock;
        this.moshi = moshi;
        this.getCryptoPulseFeedResponseDto = getCryptoPulseFeedResponseDto;
        this.getCryptoPulseFeedRefreshResponseDto = getCryptoPulseFeedRefreshResponseDto;
        this.rhsAccountNumber = str;
        this.cryptoPulseExperimentVariant = cryptoPulseExperimentVariant;
        this.isNotificationEnabled = z;
        this.assetDigestValuePropsVariant = assetDigestValuePropsVariant;
        this.direction = direction;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final Moshi getMoshi() {
        return this.moshi;
    }

    public final GetCryptoPulseFeedResponseDto getGetCryptoPulseFeedResponseDto() {
        return this.getCryptoPulseFeedResponseDto;
    }

    public final GetCryptoPulseFeedRefreshResponseDto getGetCryptoPulseFeedRefreshResponseDto() {
        return this.getCryptoPulseFeedRefreshResponseDto;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public /* synthetic */ CryptoPulseFeedDataState(Clock clock, Moshi moshi, GetCryptoPulseFeedResponseDto getCryptoPulseFeedResponseDto, GetCryptoPulseFeedRefreshResponseDto getCryptoPulseFeedRefreshResponseDto, String str, CryptoUsPulseExperiment.Variant variant, boolean z, AssetDigestValuePropsExperiment2 assetDigestValuePropsExperiment2, Direction direction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(clock, moshi, getCryptoPulseFeedResponseDto, getCryptoPulseFeedRefreshResponseDto, (i & 16) != 0 ? null : str, (i & 32) != 0 ? CryptoUsPulseExperiment.Variant.CONTROL : variant, (i & 64) != 0 ? false : z, (i & 128) != 0 ? AssetDigestValuePropsExperiment2.CONTROL : assetDigestValuePropsExperiment2, (i & 256) != 0 ? null : direction);
    }

    public final CryptoUsPulseExperiment.Variant getCryptoPulseExperimentVariant() {
        return this.cryptoPulseExperimentVariant;
    }

    public final boolean isNotificationEnabled() {
        return this.isNotificationEnabled;
    }

    public final AssetDigestValuePropsExperiment2 getAssetDigestValuePropsVariant() {
        return this.assetDigestValuePropsVariant;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final ServerToBentoAssetMapper2 getNotificationIcon() {
        return this.isNotificationEnabled ? ServerToBentoAssetMapper2.NOTIFICATION_CHECK_24 : ServerToBentoAssetMapper2.NOTIFICATION_ADD_24;
    }

    public final String getTitleText() {
        return this.getCryptoPulseFeedResponseDto.getTitle();
    }

    public final StringResource getSubtitleText() {
        if (this.getCryptoPulseFeedResponseDto.getUpdated_at() == null) {
            return StringResource.INSTANCE.invoke("");
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C12924R.string.crypto_pulse_feed_header_subtitle;
        Instant updated_at = this.getCryptoPulseFeedResponseDto.getUpdated_at();
        if (updated_at != null) {
            return companion.invoke(i, CryptoPulseUpdatedAtFormatter.updatedAtRelativeString(updated_at, this.clock), this.getCryptoPulseFeedResponseDto.getSubtitle());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final ImmutableList<CryptoPulseFeedItemState> getPulseFeedItemStates() {
        CryptoPulseFeedItemState.HeaderState positionDetailData;
        InstrumentDigestPreviewDto preview;
        List<GetCryptoPulseFeedRefreshResponseDto.FeedItemDto> feed_items = this.getCryptoPulseFeedRefreshResponseDto.getFeed_items();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(feed_items, 10));
        for (GetCryptoPulseFeedRefreshResponseDto.FeedItemDto feedItemDto : feed_items) {
            GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.HeaderDto header = feedItemDto.getHeader();
            AssetDigestFragmentKey assetDigestFragmentKey = null;
            GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.HeaderDto.TypeDto type2 = header != null ? header.getType() : null;
            if (type2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (type2 instanceof GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.HeaderDto.TypeDto.Condensed) {
                positionDetailData = new CryptoPulseFeedItemState.HeaderState.CondensedData(feedItemDto.getAsset_currency_code(), feedItemDto.getFormatted_quote(), feedItemDto.getPrice_movement_ratio().toBigDecimalOrThrow());
            } else {
                if (!(type2 instanceof GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.HeaderDto.TypeDto.PositionDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                positionDetailData = new CryptoPulseFeedItemState.HeaderState.PositionDetailData(feedItemDto.getAsset_currency_code(), feedItemDto.getQuantity().toBigDecimalOrThrow(), feedItemDto.getFormatted_quote(), feedItemDto.getPrice_movement_ratio().toBigDecimalOrThrow());
            }
            CryptoPulseFeedItemState.HeaderState headerState = positionDetailData;
            UUID uuid = StringsKt.toUuid(feedItemDto.getCurrency_pair_id());
            GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.DigestDto digest = feedItemDto.getDigest();
            String description = (digest == null || (preview = digest.getPreview()) == null) ? null : preview.getDescription();
            String str = description == null ? "" : description;
            GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.TradeButtonContentDto trade_button_content = feedItemDto.getTrade_button_content();
            if (trade_button_content == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            BigDecimal bigDecimalOrThrow = feedItemDto.getPrice_movement_ratio().toBigDecimalOrThrow();
            ColorDto colorDto = BigDecimals7.isZero(bigDecimalOrThrow) ? ColorDto.COLOR_FG3 : BigDecimals7.isPositive(bigDecimalOrThrow) ? ColorDto.COLOR_POSITIVE : ColorDto.COLOR_NEGATIVE;
            ExpandableButtonTrayState.ExpandButton expandButton = new ExpandableButtonTrayState.ExpandButton(StringResource.INSTANCE.invoke(trade_button_content.getExpand_button_text()), null, trade_button_content.is_expand_button_enabled(), ColorDto.COLOR_BG, ColorDto.COLOR_FG, ColorDto.COLOR_FG3, false, 66, null);
            ExpandableButtonTrayState.ExpandAnimationType expandAnimationType = ExpandableButtonTrayState.ExpandAnimationType.BOUNCE_ON_EXPAND;
            List listReversed = CollectionsKt.reversed(trade_button_content.getTrade_buttons());
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listReversed, 10));
            Iterator it = listReversed.iterator();
            while (it.hasNext()) {
                arrayList2.add(new ExpandableButtonTrayState.ActionButton.IdlButton((ButtonDto) it.next()));
            }
            ExpandableButtonTrayState cryptoExpandableButtonTrayComposable6 = new ExpandableButtonTrayState(expandButton, extensions2.toImmutableList(arrayList2), null, false, false, expandAnimationType, colorDto, 28, null);
            GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.DigestDto digest2 = feedItemDto.getDigest();
            if (digest2 != null) {
                String digest_id = digest2.getDigest_id();
                String str2 = this.rhsAccountNumber;
                String str3 = str2 == null ? "" : str2;
                UUID uuid2 = StringsKt.toUuid(feedItemDto.getCurrency_pair_id());
                AssetType3 assetType3 = AssetType3.CRYPTO;
                InstrumentDigestPreviewDto preview2 = digest2.getPreview();
                if (preview2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                AssetDigestPreview uiModel = AssetDigest4.toUiModel(preview2);
                InstrumentDigestDetailDto detail = digest2.getDetail();
                if (detail == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                AssetDigestDetail uiModel2 = AssetDigest4.toUiModel(detail);
                Instant updated_at = this.getCryptoPulseFeedResponseDto.getUpdated_at();
                if (updated_at == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                assetDigestFragmentKey = new AssetDigestFragmentKey(new AssetDigest.HasSignedAgreement(digest_id, str3, uuid2, assetType3, uiModel, uiModel2, updated_at), this.assetDigestValuePropsVariant);
            }
            arrayList.add(new CryptoPulseFeedItemState(uuid, str, cryptoExpandableButtonTrayComposable6, headerState, assetDigestFragmentKey));
        }
        return extensions2.toImmutableList(arrayList);
    }

    public final TextDto getDisclosuresTextDto() {
        return this.getCryptoPulseFeedResponseDto.getDisclosure_text();
    }
}
