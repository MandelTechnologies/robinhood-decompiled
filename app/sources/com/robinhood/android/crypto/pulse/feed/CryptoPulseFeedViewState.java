package com.robinhood.android.crypto.pulse.feed;

import com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.librobinhood.data.store.CryptoUsPulseExperiment;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import rh_server_driven_ui.p531v1.TextDto;

/* compiled from: CryptoPulseFeedViewState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003J]\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedViewState;", "", "cryptoPulseExperimentVariant", "Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;", "notificationIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "titleText", "", "subtitleText", "Lcom/robinhood/utils/resource/StringResource;", "pulseFeedItemStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState;", "disclosuresTextDto", "Lrh_server_driven_ui/v1/TextDto;", "direction", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;Lrh_server_driven_ui/v1/TextDto;Lcom/robinhood/models/serverdriven/experimental/api/Direction;)V", "getCryptoPulseExperimentVariant", "()Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;", "getNotificationIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getTitleText", "()Ljava/lang/String;", "getSubtitleText", "()Lcom/robinhood/utils/resource/StringResource;", "getPulseFeedItemStates", "()Lkotlinx/collections/immutable/ImmutableList;", "getDisclosuresTextDto", "()Lrh_server_driven_ui/v1/TextDto;", "getDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoPulseFeedViewState {
    public static final int $stable = 8;
    private final CryptoUsPulseExperiment.Variant cryptoPulseExperimentVariant;
    private final Direction direction;
    private final TextDto disclosuresTextDto;
    private final ServerToBentoAssetMapper2 notificationIcon;
    private final ImmutableList<CryptoPulseFeedItemState> pulseFeedItemStates;
    private final StringResource subtitleText;
    private final String titleText;

    public static /* synthetic */ CryptoPulseFeedViewState copy$default(CryptoPulseFeedViewState cryptoPulseFeedViewState, CryptoUsPulseExperiment.Variant variant, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, StringResource stringResource, ImmutableList immutableList, TextDto textDto, Direction direction, int i, Object obj) {
        if ((i & 1) != 0) {
            variant = cryptoPulseFeedViewState.cryptoPulseExperimentVariant;
        }
        if ((i & 2) != 0) {
            serverToBentoAssetMapper2 = cryptoPulseFeedViewState.notificationIcon;
        }
        if ((i & 4) != 0) {
            str = cryptoPulseFeedViewState.titleText;
        }
        if ((i & 8) != 0) {
            stringResource = cryptoPulseFeedViewState.subtitleText;
        }
        if ((i & 16) != 0) {
            immutableList = cryptoPulseFeedViewState.pulseFeedItemStates;
        }
        if ((i & 32) != 0) {
            textDto = cryptoPulseFeedViewState.disclosuresTextDto;
        }
        if ((i & 64) != 0) {
            direction = cryptoPulseFeedViewState.direction;
        }
        TextDto textDto2 = textDto;
        Direction direction2 = direction;
        ImmutableList immutableList2 = immutableList;
        String str2 = str;
        return cryptoPulseFeedViewState.copy(variant, serverToBentoAssetMapper2, str2, stringResource, immutableList2, textDto2, direction2);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoUsPulseExperiment.Variant getCryptoPulseExperimentVariant() {
        return this.cryptoPulseExperimentVariant;
    }

    /* renamed from: component2, reason: from getter */
    public final ServerToBentoAssetMapper2 getNotificationIcon() {
        return this.notificationIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getSubtitleText() {
        return this.subtitleText;
    }

    public final ImmutableList<CryptoPulseFeedItemState> component5() {
        return this.pulseFeedItemStates;
    }

    /* renamed from: component6, reason: from getter */
    public final TextDto getDisclosuresTextDto() {
        return this.disclosuresTextDto;
    }

    /* renamed from: component7, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    public final CryptoPulseFeedViewState copy(CryptoUsPulseExperiment.Variant cryptoPulseExperimentVariant, ServerToBentoAssetMapper2 notificationIcon, String titleText, StringResource subtitleText, ImmutableList<CryptoPulseFeedItemState> pulseFeedItemStates, TextDto disclosuresTextDto, Direction direction) {
        Intrinsics.checkNotNullParameter(cryptoPulseExperimentVariant, "cryptoPulseExperimentVariant");
        Intrinsics.checkNotNullParameter(notificationIcon, "notificationIcon");
        Intrinsics.checkNotNullParameter(pulseFeedItemStates, "pulseFeedItemStates");
        return new CryptoPulseFeedViewState(cryptoPulseExperimentVariant, notificationIcon, titleText, subtitleText, pulseFeedItemStates, disclosuresTextDto, direction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoPulseFeedViewState)) {
            return false;
        }
        CryptoPulseFeedViewState cryptoPulseFeedViewState = (CryptoPulseFeedViewState) other;
        return this.cryptoPulseExperimentVariant == cryptoPulseFeedViewState.cryptoPulseExperimentVariant && this.notificationIcon == cryptoPulseFeedViewState.notificationIcon && Intrinsics.areEqual(this.titleText, cryptoPulseFeedViewState.titleText) && Intrinsics.areEqual(this.subtitleText, cryptoPulseFeedViewState.subtitleText) && Intrinsics.areEqual(this.pulseFeedItemStates, cryptoPulseFeedViewState.pulseFeedItemStates) && Intrinsics.areEqual(this.disclosuresTextDto, cryptoPulseFeedViewState.disclosuresTextDto) && this.direction == cryptoPulseFeedViewState.direction;
    }

    public int hashCode() {
        int iHashCode = ((this.cryptoPulseExperimentVariant.hashCode() * 31) + this.notificationIcon.hashCode()) * 31;
        String str = this.titleText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        StringResource stringResource = this.subtitleText;
        int iHashCode3 = (((iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.pulseFeedItemStates.hashCode()) * 31;
        TextDto textDto = this.disclosuresTextDto;
        int iHashCode4 = (iHashCode3 + (textDto == null ? 0 : textDto.hashCode())) * 31;
        Direction direction = this.direction;
        return iHashCode4 + (direction != null ? direction.hashCode() : 0);
    }

    public String toString() {
        return "CryptoPulseFeedViewState(cryptoPulseExperimentVariant=" + this.cryptoPulseExperimentVariant + ", notificationIcon=" + this.notificationIcon + ", titleText=" + this.titleText + ", subtitleText=" + this.subtitleText + ", pulseFeedItemStates=" + this.pulseFeedItemStates + ", disclosuresTextDto=" + this.disclosuresTextDto + ", direction=" + this.direction + ")";
    }

    public CryptoPulseFeedViewState(CryptoUsPulseExperiment.Variant cryptoPulseExperimentVariant, ServerToBentoAssetMapper2 notificationIcon, String str, StringResource stringResource, ImmutableList<CryptoPulseFeedItemState> pulseFeedItemStates, TextDto textDto, Direction direction) {
        Intrinsics.checkNotNullParameter(cryptoPulseExperimentVariant, "cryptoPulseExperimentVariant");
        Intrinsics.checkNotNullParameter(notificationIcon, "notificationIcon");
        Intrinsics.checkNotNullParameter(pulseFeedItemStates, "pulseFeedItemStates");
        this.cryptoPulseExperimentVariant = cryptoPulseExperimentVariant;
        this.notificationIcon = notificationIcon;
        this.titleText = str;
        this.subtitleText = stringResource;
        this.pulseFeedItemStates = pulseFeedItemStates;
        this.disclosuresTextDto = textDto;
        this.direction = direction;
    }

    public final CryptoUsPulseExperiment.Variant getCryptoPulseExperimentVariant() {
        return this.cryptoPulseExperimentVariant;
    }

    public final ServerToBentoAssetMapper2 getNotificationIcon() {
        return this.notificationIcon;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final StringResource getSubtitleText() {
        return this.subtitleText;
    }

    public final ImmutableList<CryptoPulseFeedItemState> getPulseFeedItemStates() {
        return this.pulseFeedItemStates;
    }

    public final TextDto getDisclosuresTextDto() {
        return this.disclosuresTextDto;
    }

    public final Direction getDirection() {
        return this.direction;
    }
}
