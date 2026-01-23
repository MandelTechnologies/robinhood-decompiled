package com.robinhood.android.cortex.digest.asset;

import android.content.res.Resources;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackType;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.cortex.models.asset.AssetDigest6;
import com.robinhood.android.cortex.models.asset.AssetDigestDetail;
import com.robinhood.android.cortex.models.asset.AssetDigestDetailItem;
import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.util.Money;
import com.robinhood.time.android.format.DurationFormatter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: AssetDigestViewState.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0003[\\]B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÂ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÂ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÂ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u0011HÂ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0017HÂ\u0003¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\f¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0000¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b3\u0010+J\u001e\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b4\u00105J¦\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\u00112\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010AR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010BR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010CR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ER\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010FR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010GR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010FR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\b\u0012\u0010+R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010I\u001a\u0004\bJ\u00105R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010HR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010KR\u0017\u0010L\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bL\u0010+R\u0013\u0010P\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0013\u0010T\u001a\u0004\u0018\u00010Q8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010X\u001a\u0004\u0018\u00010U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0013\u0010Z\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bY\u0010-¨\u0006^"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;", "", "j$/time/Instant", "now", "Lcom/robinhood/models/db/Instrument;", "instrument", "Lcom/robinhood/models/db/Quote;", "quote", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "currencyPair", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "cryptoQuote", "Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;", "digest", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "feedback", "pendingDigest", "", "isSubmittingFeedback", "Lkotlin/Pair;", "Lcom/robinhood/android/cortex/digest/common/feedback/DigestFeedbackType;", "feedbackBottomSheetParams", "hasShownBreakingNewsBottomSheet", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;", "selectedArticleSource", "<init>", "(Lj$/time/Instant;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/CryptoQuote;Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;ZLkotlin/Pair;ZLcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;)V", "component1", "()Lj$/time/Instant;", "component2", "()Lcom/robinhood/models/db/Instrument;", "component3", "()Lcom/robinhood/models/db/Quote;", "component4", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "component5", "()Lcom/robinhood/models/crypto/db/CryptoQuote;", "component6", "()Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;", "component7", "()Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "component8", "component11", "()Z", "component12", "()Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;", "newDigest", "applyUpdatedDigest", "(Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;)Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;", "swapToPendingDigest", "()Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;", "component9", "component10", "()Lkotlin/Pair;", "copy", "(Lj$/time/Instant;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/CryptoQuote;Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;ZLkotlin/Pair;ZLcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;)Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "Lcom/robinhood/models/db/Instrument;", "Lcom/robinhood/models/db/Quote;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "Z", "Lkotlin/Pair;", "getFeedbackBottomSheetParams", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;", "isRefreshVisible", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ToolbarContent;", "getToolbarContent", "()Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ToolbarContent;", "toolbarContent", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$LoadedContent;", "getLoadedContent", "()Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$LoadedContent;", "loadedContent", "Lcom/robinhood/android/cortex/models/asset/AssetDigestDetailItem;", "getBreakingNewsBottomSheetParams", "()Lcom/robinhood/android/cortex/models/asset/AssetDigestDetailItem;", "breakingNewsBottomSheetParams", "getSourceBottomSheetParams", "sourceBottomSheetParams", "LoadedContent", "ToolbarContent", "ArticleSourceContent", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class AssetDigestViewState {
    public static final int $stable = 8;
    private final CryptoQuote cryptoQuote;
    private final UiCurrencyPair currencyPair;
    private final AssetDigest.HasSignedAgreement digest;
    private final DigestFeedback feedback;
    private final Tuples2<DigestFeedbackType, DigestFeedback> feedbackBottomSheetParams;
    private final boolean hasShownBreakingNewsBottomSheet;
    private final Instrument instrument;
    private final boolean isRefreshVisible;
    private final boolean isSubmittingFeedback;
    private final Instant now;
    private final AssetDigest.HasSignedAgreement pendingDigest;
    private final Quote quote;
    private final ArticleSourceContent selectedArticleSource;

    /* compiled from: AssetDigestViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetType3.values().length];
            try {
                iArr[AssetType3.STOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetType3.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final Instant getNow() {
        return this.now;
    }

    /* renamed from: component11, reason: from getter */
    private final boolean getHasShownBreakingNewsBottomSheet() {
        return this.hasShownBreakingNewsBottomSheet;
    }

    /* renamed from: component12, reason: from getter */
    private final ArticleSourceContent getSelectedArticleSource() {
        return this.selectedArticleSource;
    }

    /* renamed from: component2, reason: from getter */
    private final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component3, reason: from getter */
    private final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component4, reason: from getter */
    private final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component5, reason: from getter */
    private final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    /* renamed from: component6, reason: from getter */
    private final AssetDigest.HasSignedAgreement getDigest() {
        return this.digest;
    }

    /* renamed from: component7, reason: from getter */
    private final DigestFeedback getFeedback() {
        return this.feedback;
    }

    /* renamed from: component8, reason: from getter */
    private final AssetDigest.HasSignedAgreement getPendingDigest() {
        return this.pendingDigest;
    }

    public static /* synthetic */ AssetDigestViewState copy$default(AssetDigestViewState assetDigestViewState, Instant instant, Instrument instrument, Quote quote, UiCurrencyPair uiCurrencyPair, CryptoQuote cryptoQuote, AssetDigest.HasSignedAgreement hasSignedAgreement, DigestFeedback digestFeedback, AssetDigest.HasSignedAgreement hasSignedAgreement2, boolean z, Tuples2 tuples2, boolean z2, ArticleSourceContent articleSourceContent, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = assetDigestViewState.now;
        }
        if ((i & 2) != 0) {
            instrument = assetDigestViewState.instrument;
        }
        if ((i & 4) != 0) {
            quote = assetDigestViewState.quote;
        }
        if ((i & 8) != 0) {
            uiCurrencyPair = assetDigestViewState.currencyPair;
        }
        if ((i & 16) != 0) {
            cryptoQuote = assetDigestViewState.cryptoQuote;
        }
        if ((i & 32) != 0) {
            hasSignedAgreement = assetDigestViewState.digest;
        }
        if ((i & 64) != 0) {
            digestFeedback = assetDigestViewState.feedback;
        }
        if ((i & 128) != 0) {
            hasSignedAgreement2 = assetDigestViewState.pendingDigest;
        }
        if ((i & 256) != 0) {
            z = assetDigestViewState.isSubmittingFeedback;
        }
        if ((i & 512) != 0) {
            tuples2 = assetDigestViewState.feedbackBottomSheetParams;
        }
        if ((i & 1024) != 0) {
            z2 = assetDigestViewState.hasShownBreakingNewsBottomSheet;
        }
        if ((i & 2048) != 0) {
            articleSourceContent = assetDigestViewState.selectedArticleSource;
        }
        boolean z3 = z2;
        ArticleSourceContent articleSourceContent2 = articleSourceContent;
        boolean z4 = z;
        Tuples2 tuples22 = tuples2;
        DigestFeedback digestFeedback2 = digestFeedback;
        AssetDigest.HasSignedAgreement hasSignedAgreement3 = hasSignedAgreement2;
        CryptoQuote cryptoQuote2 = cryptoQuote;
        AssetDigest.HasSignedAgreement hasSignedAgreement4 = hasSignedAgreement;
        return assetDigestViewState.copy(instant, instrument, quote, uiCurrencyPair, cryptoQuote2, hasSignedAgreement4, digestFeedback2, hasSignedAgreement3, z4, tuples22, z3, articleSourceContent2);
    }

    public final Tuples2<DigestFeedbackType, DigestFeedback> component10() {
        return this.feedbackBottomSheetParams;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsSubmittingFeedback() {
        return this.isSubmittingFeedback;
    }

    public final AssetDigestViewState copy(Instant now, Instrument instrument, Quote quote, UiCurrencyPair currencyPair, CryptoQuote cryptoQuote, AssetDigest.HasSignedAgreement digest, DigestFeedback feedback, AssetDigest.HasSignedAgreement pendingDigest, boolean isSubmittingFeedback, Tuples2<? extends DigestFeedbackType, ? extends DigestFeedback> feedbackBottomSheetParams, boolean hasShownBreakingNewsBottomSheet, ArticleSourceContent selectedArticleSource) {
        Intrinsics.checkNotNullParameter(now, "now");
        return new AssetDigestViewState(now, instrument, quote, currencyPair, cryptoQuote, digest, feedback, pendingDigest, isSubmittingFeedback, feedbackBottomSheetParams, hasShownBreakingNewsBottomSheet, selectedArticleSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetDigestViewState)) {
            return false;
        }
        AssetDigestViewState assetDigestViewState = (AssetDigestViewState) other;
        return Intrinsics.areEqual(this.now, assetDigestViewState.now) && Intrinsics.areEqual(this.instrument, assetDigestViewState.instrument) && Intrinsics.areEqual(this.quote, assetDigestViewState.quote) && Intrinsics.areEqual(this.currencyPair, assetDigestViewState.currencyPair) && Intrinsics.areEqual(this.cryptoQuote, assetDigestViewState.cryptoQuote) && Intrinsics.areEqual(this.digest, assetDigestViewState.digest) && Intrinsics.areEqual(this.feedback, assetDigestViewState.feedback) && Intrinsics.areEqual(this.pendingDigest, assetDigestViewState.pendingDigest) && this.isSubmittingFeedback == assetDigestViewState.isSubmittingFeedback && Intrinsics.areEqual(this.feedbackBottomSheetParams, assetDigestViewState.feedbackBottomSheetParams) && this.hasShownBreakingNewsBottomSheet == assetDigestViewState.hasShownBreakingNewsBottomSheet && Intrinsics.areEqual(this.selectedArticleSource, assetDigestViewState.selectedArticleSource);
    }

    public int hashCode() {
        int iHashCode = this.now.hashCode() * 31;
        Instrument instrument = this.instrument;
        int iHashCode2 = (iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode3 = (iHashCode2 + (quote == null ? 0 : quote.hashCode())) * 31;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        int iHashCode4 = (iHashCode3 + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31;
        CryptoQuote cryptoQuote = this.cryptoQuote;
        int iHashCode5 = (iHashCode4 + (cryptoQuote == null ? 0 : cryptoQuote.hashCode())) * 31;
        AssetDigest.HasSignedAgreement hasSignedAgreement = this.digest;
        int iHashCode6 = (iHashCode5 + (hasSignedAgreement == null ? 0 : hasSignedAgreement.hashCode())) * 31;
        DigestFeedback digestFeedback = this.feedback;
        int iHashCode7 = (iHashCode6 + (digestFeedback == null ? 0 : digestFeedback.hashCode())) * 31;
        AssetDigest.HasSignedAgreement hasSignedAgreement2 = this.pendingDigest;
        int iHashCode8 = (((iHashCode7 + (hasSignedAgreement2 == null ? 0 : hasSignedAgreement2.hashCode())) * 31) + Boolean.hashCode(this.isSubmittingFeedback)) * 31;
        Tuples2<DigestFeedbackType, DigestFeedback> tuples2 = this.feedbackBottomSheetParams;
        int iHashCode9 = (((iHashCode8 + (tuples2 == null ? 0 : tuples2.hashCode())) * 31) + Boolean.hashCode(this.hasShownBreakingNewsBottomSheet)) * 31;
        ArticleSourceContent articleSourceContent = this.selectedArticleSource;
        return iHashCode9 + (articleSourceContent != null ? articleSourceContent.hashCode() : 0);
    }

    public String toString() {
        return "AssetDigestViewState(now=" + this.now + ", instrument=" + this.instrument + ", quote=" + this.quote + ", currencyPair=" + this.currencyPair + ", cryptoQuote=" + this.cryptoQuote + ", digest=" + this.digest + ", feedback=" + this.feedback + ", pendingDigest=" + this.pendingDigest + ", isSubmittingFeedback=" + this.isSubmittingFeedback + ", feedbackBottomSheetParams=" + this.feedbackBottomSheetParams + ", hasShownBreakingNewsBottomSheet=" + this.hasShownBreakingNewsBottomSheet + ", selectedArticleSource=" + this.selectedArticleSource + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssetDigestViewState(Instant now, Instrument instrument, Quote quote, UiCurrencyPair uiCurrencyPair, CryptoQuote cryptoQuote, AssetDigest.HasSignedAgreement hasSignedAgreement, DigestFeedback digestFeedback, AssetDigest.HasSignedAgreement hasSignedAgreement2, boolean z, Tuples2<? extends DigestFeedbackType, ? extends DigestFeedback> tuples2, boolean z2, ArticleSourceContent articleSourceContent) {
        Intrinsics.checkNotNullParameter(now, "now");
        this.now = now;
        this.instrument = instrument;
        this.quote = quote;
        this.currencyPair = uiCurrencyPair;
        this.cryptoQuote = cryptoQuote;
        this.digest = hasSignedAgreement;
        this.feedback = digestFeedback;
        this.pendingDigest = hasSignedAgreement2;
        this.isSubmittingFeedback = z;
        this.feedbackBottomSheetParams = tuples2;
        this.hasShownBreakingNewsBottomSheet = z2;
        this.selectedArticleSource = articleSourceContent;
        this.isRefreshVisible = hasSignedAgreement2 != null;
    }

    public /* synthetic */ AssetDigestViewState(Instant instant, Instrument instrument, Quote quote, UiCurrencyPair uiCurrencyPair, CryptoQuote cryptoQuote, AssetDigest.HasSignedAgreement hasSignedAgreement, DigestFeedback digestFeedback, AssetDigest.HasSignedAgreement hasSignedAgreement2, boolean z, Tuples2 tuples2, boolean z2, ArticleSourceContent articleSourceContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, (i & 2) != 0 ? null : instrument, (i & 4) != 0 ? null : quote, (i & 8) != 0 ? null : uiCurrencyPair, (i & 16) != 0 ? null : cryptoQuote, (i & 32) != 0 ? null : hasSignedAgreement, (i & 64) != 0 ? null : digestFeedback, (i & 128) != 0 ? null : hasSignedAgreement2, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : tuples2, (i & 1024) == 0 ? z2 : false, (i & 2048) != 0 ? null : articleSourceContent);
    }

    public final boolean isSubmittingFeedback() {
        return this.isSubmittingFeedback;
    }

    public final Tuples2<DigestFeedbackType, DigestFeedback> getFeedbackBottomSheetParams() {
        return this.feedbackBottomSheetParams;
    }

    public final ToolbarContent getToolbarContent() {
        AssetDigest.HasSignedAgreement hasSignedAgreement = this.digest;
        AssetType3 instrumentType = hasSignedAgreement != null ? hasSignedAgreement.getInstrumentType() : null;
        int i = instrumentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            if (this.instrument == null || this.quote == null) {
                return null;
            }
            return new ToolbarContent.Equity(this.instrument, this.quote);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.currencyPair == null || this.cryptoQuote == null) {
            return null;
        }
        return new ToolbarContent.Crypto(this.currencyPair, this.cryptoQuote);
    }

    /* renamed from: isRefreshVisible, reason: from getter */
    public final boolean getIsRefreshVisible() {
        return this.isRefreshVisible;
    }

    public final LoadedContent getLoadedContent() {
        if (this.digest == null) {
            return null;
        }
        return new LoadedContent(this.now, this.digest, this.feedback);
    }

    public final AssetDigestDetailItem getBreakingNewsBottomSheetParams() {
        AssetDigest.HasSignedAgreement hasSignedAgreement;
        AssetDigestDetail detail;
        List<AssetDigestDetailItem> body;
        Object obj = null;
        if (this.hasShownBreakingNewsBottomSheet || this.feedbackBottomSheetParams != null || (hasSignedAgreement = this.pendingDigest) == null || (detail = hasSignedAgreement.getDetail()) == null || (body = detail.getBody()) == null) {
            return null;
        }
        Iterator<T> it = body.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((AssetDigestDetailItem) next).getStyle() == AssetDigest6.BREAKING) {
                obj = next;
                break;
            }
        }
        return (AssetDigestDetailItem) obj;
    }

    public final ArticleSourceContent getSourceBottomSheetParams() {
        if (this.feedbackBottomSheetParams == null && getBreakingNewsBottomSheetParams() == null) {
            return this.selectedArticleSource;
        }
        return null;
    }

    public final AssetDigestViewState applyUpdatedDigest(AssetDigest.HasSignedAgreement newDigest) {
        Intrinsics.checkNotNullParameter(newDigest, "newDigest");
        AssetDigest.HasSignedAgreement hasSignedAgreement = this.digest;
        if (hasSignedAgreement == null) {
            return copy$default(this, null, null, null, null, null, newDigest, null, null, false, null, false, null, 4063, null);
        }
        return hasSignedAgreement.getUpdatedAt().compareTo(newDigest.getUpdatedAt()) < 0 ? copy$default(this, null, null, null, null, null, null, null, newDigest, false, null, false, null, 3967, null) : this;
    }

    public final AssetDigestViewState swapToPendingDigest() {
        AssetDigest.HasSignedAgreement hasSignedAgreement = this.pendingDigest;
        return hasSignedAgreement == null ? this : copy$default(this, null, null, null, null, null, hasSignedAgreement, null, null, false, null, false, null, 1375, null);
    }

    /* compiled from: AssetDigestViewState.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010 \u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010#\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0014R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0%8\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0017\u0010.\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010\u0014¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$LoadedContent;", "", "j$/time/Instant", "now", "Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;", "digest", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "feedback", "<init>", "(Lj$/time/Instant;Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;)V", "component1", "()Lj$/time/Instant;", "component2", "()Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;", "component3", "()Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "copy", "(Lj$/time/Instant;Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;)Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$LoadedContent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "getFeedback", "title", "Ljava/lang/String;", "getTitle", "updatedAt", "getUpdatedAt", "", "Lcom/robinhood/android/cortex/models/asset/AssetDigestDetailItem;", CarResultComposable2.BODY, "Ljava/util/List;", "getBody", "()Ljava/util/List;", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;", "sources", "getSources", "disclosureMarkdown", "getDisclosureMarkdown", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class LoadedContent {
        public static final int $stable = 8;
        private final List<AssetDigestDetailItem> body;
        private final AssetDigest.HasSignedAgreement digest;
        private final String disclosureMarkdown;
        private final DigestFeedback feedback;
        private final Instant now;
        private final List<ArticleSourceContent> sources;
        private final String title;
        private final String updatedAt;

        /* renamed from: component1, reason: from getter */
        private final Instant getNow() {
            return this.now;
        }

        /* renamed from: component2, reason: from getter */
        private final AssetDigest.HasSignedAgreement getDigest() {
            return this.digest;
        }

        public static /* synthetic */ LoadedContent copy$default(LoadedContent loadedContent, Instant instant, AssetDigest.HasSignedAgreement hasSignedAgreement, DigestFeedback digestFeedback, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = loadedContent.now;
            }
            if ((i & 2) != 0) {
                hasSignedAgreement = loadedContent.digest;
            }
            if ((i & 4) != 0) {
                digestFeedback = loadedContent.feedback;
            }
            return loadedContent.copy(instant, hasSignedAgreement, digestFeedback);
        }

        /* renamed from: component3, reason: from getter */
        public final DigestFeedback getFeedback() {
            return this.feedback;
        }

        public final LoadedContent copy(Instant now, AssetDigest.HasSignedAgreement digest, DigestFeedback feedback) {
            Intrinsics.checkNotNullParameter(now, "now");
            Intrinsics.checkNotNullParameter(digest, "digest");
            return new LoadedContent(now, digest, feedback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadedContent)) {
                return false;
            }
            LoadedContent loadedContent = (LoadedContent) other;
            return Intrinsics.areEqual(this.now, loadedContent.now) && Intrinsics.areEqual(this.digest, loadedContent.digest) && Intrinsics.areEqual(this.feedback, loadedContent.feedback);
        }

        public int hashCode() {
            int iHashCode = ((this.now.hashCode() * 31) + this.digest.hashCode()) * 31;
            DigestFeedback digestFeedback = this.feedback;
            return iHashCode + (digestFeedback == null ? 0 : digestFeedback.hashCode());
        }

        public String toString() {
            return "LoadedContent(now=" + this.now + ", digest=" + this.digest + ", feedback=" + this.feedback + ")";
        }

        public LoadedContent(Instant now, AssetDigest.HasSignedAgreement digest, DigestFeedback digestFeedback) {
            Intrinsics.checkNotNullParameter(now, "now");
            Intrinsics.checkNotNullParameter(digest, "digest");
            this.now = now;
            this.digest = digest;
            this.feedback = digestFeedback;
            this.title = digest.getDetail().getTitle();
            Duration durationBetween = Duration.between(digest.getUpdatedAt(), now);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            this.updatedAt = DurationFormatter.formatWide(durationBetween);
            this.body = digest.getDetail().getBody();
            List<ArticleSource> sources = digest.getDetail().getSources();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sources, 10));
            Iterator<T> it = sources.iterator();
            while (it.hasNext()) {
                arrayList.add(new ArticleSourceContent(this.now, (ArticleSource) it.next()));
            }
            this.sources = arrayList;
            this.disclosureMarkdown = this.digest.getDetail().getDisclosureMarkdown();
        }

        public final DigestFeedback getFeedback() {
            return this.feedback;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUpdatedAt() {
            return this.updatedAt;
        }

        public final List<AssetDigestDetailItem> getBody() {
            return this.body;
        }

        public final List<ArticleSourceContent> getSources() {
            return this.sources;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }
    }

    /* compiled from: AssetDigestViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ToolbarContent;", "", "symbol", "", "getSymbol", "()Ljava/lang/String;", "lastTradePrice", "Lcom/robinhood/models/util/Money;", "getLastTradePrice", "()Lcom/robinhood/models/util/Money;", "direction", "Lcom/robinhood/compose/bento/theme/Direction;", "getDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "Equity", "Crypto", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ToolbarContent$Crypto;", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ToolbarContent$Equity;", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ToolbarContent {
        BentoTheme4 getDirection();

        Money getLastTradePrice();

        String getSymbol();

        /* compiled from: AssetDigestViewState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ToolbarContent$Equity;", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ToolbarContent;", "instrument", "Lcom/robinhood/models/db/Instrument;", "quote", "Lcom/robinhood/models/db/Quote;", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Quote;)V", "symbol", "", "getSymbol", "()Ljava/lang/String;", "lastTradePrice", "Lcom/robinhood/models/util/Money;", "getLastTradePrice", "()Lcom/robinhood/models/util/Money;", "direction", "Lcom/robinhood/compose/bento/theme/Direction;", "getDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Equity implements ToolbarContent {
            public static final int $stable = 8;
            private final Instrument instrument;
            private final Quote quote;

            /* renamed from: component1, reason: from getter */
            private final Instrument getInstrument() {
                return this.instrument;
            }

            /* renamed from: component2, reason: from getter */
            private final Quote getQuote() {
                return this.quote;
            }

            public static /* synthetic */ Equity copy$default(Equity equity, Instrument instrument, Quote quote, int i, Object obj) {
                if ((i & 1) != 0) {
                    instrument = equity.instrument;
                }
                if ((i & 2) != 0) {
                    quote = equity.quote;
                }
                return equity.copy(instrument, quote);
            }

            public final Equity copy(Instrument instrument, Quote quote) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(quote, "quote");
                return new Equity(instrument, quote);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Equity)) {
                    return false;
                }
                Equity equity = (Equity) other;
                return Intrinsics.areEqual(this.instrument, equity.instrument) && Intrinsics.areEqual(this.quote, equity.quote);
            }

            public int hashCode() {
                return (this.instrument.hashCode() * 31) + this.quote.hashCode();
            }

            public String toString() {
                return "Equity(instrument=" + this.instrument + ", quote=" + this.quote + ")";
            }

            public Equity(Instrument instrument, Quote quote) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(quote, "quote");
                this.instrument = instrument;
                this.quote = quote;
            }

            @Override // com.robinhood.android.cortex.digest.asset.AssetDigestViewState.ToolbarContent
            public String getSymbol() {
                return this.instrument.getSymbol();
            }

            @Override // com.robinhood.android.cortex.digest.asset.AssetDigestViewState.ToolbarContent
            public Money getLastTradePrice() {
                return this.quote.getLastTradePrice();
            }

            @Override // com.robinhood.android.cortex.digest.asset.AssetDigestViewState.ToolbarContent
            public BentoTheme4 getDirection() {
                return this.quote.getTodaysPercentChange().compareTo(BigDecimal.ZERO) >= 0 ? BentoTheme4.POSITIVE : BentoTheme4.NEGATIVE;
            }
        }

        /* compiled from: AssetDigestViewState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ToolbarContent$Crypto;", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ToolbarContent;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "quote", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/CryptoQuote;)V", "symbol", "", "getSymbol", "()Ljava/lang/String;", "lastTradePrice", "Lcom/robinhood/models/util/Money;", "getLastTradePrice", "()Lcom/robinhood/models/util/Money;", "direction", "Lcom/robinhood/compose/bento/theme/Direction;", "getDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Crypto implements ToolbarContent {
            public static final int $stable = 8;
            private final UiCurrencyPair currencyPair;
            private final CryptoQuote quote;

            /* renamed from: component1, reason: from getter */
            private final UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            /* renamed from: component2, reason: from getter */
            private final CryptoQuote getQuote() {
                return this.quote;
            }

            public static /* synthetic */ Crypto copy$default(Crypto crypto2, UiCurrencyPair uiCurrencyPair, CryptoQuote cryptoQuote, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCurrencyPair = crypto2.currencyPair;
                }
                if ((i & 2) != 0) {
                    cryptoQuote = crypto2.quote;
                }
                return crypto2.copy(uiCurrencyPair, cryptoQuote);
            }

            public final Crypto copy(UiCurrencyPair currencyPair, CryptoQuote quote) {
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(quote, "quote");
                return new Crypto(currencyPair, quote);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Crypto)) {
                    return false;
                }
                Crypto crypto2 = (Crypto) other;
                return Intrinsics.areEqual(this.currencyPair, crypto2.currencyPair) && Intrinsics.areEqual(this.quote, crypto2.quote);
            }

            public int hashCode() {
                return (this.currencyPair.hashCode() * 31) + this.quote.hashCode();
            }

            public String toString() {
                return "Crypto(currencyPair=" + this.currencyPair + ", quote=" + this.quote + ")";
            }

            public Crypto(UiCurrencyPair currencyPair, CryptoQuote quote) {
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(quote, "quote");
                this.currencyPair = currencyPair;
                this.quote = quote;
            }

            @Override // com.robinhood.android.cortex.digest.asset.AssetDigestViewState.ToolbarContent
            public String getSymbol() {
                return this.currencyPair.getDisplaySymbol();
            }

            @Override // com.robinhood.android.cortex.digest.asset.AssetDigestViewState.ToolbarContent
            public Money getLastTradePrice() {
                return this.quote.getMarkPrice();
            }

            @Override // com.robinhood.android.cortex.digest.asset.AssetDigestViewState.ToolbarContent
            public BentoTheme4 getDirection() {
                return this.quote.getPercentChange().compareTo(BigDecimal.ZERO) >= 0 ? BentoTheme4.POSITIVE : BentoTheme4.NEGATIVE;
            }
        }
    }

    /* compiled from: AssetDigestViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010$\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0014R\u0017\u0010'\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0014R\u0017\u0010)\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0014¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;", "", "j$/time/Instant", "now", "Lcom/robinhood/android/cortex/models/ArticleSource;", "articleSource", "<init>", "(Lj$/time/Instant;Lcom/robinhood/android/cortex/models/ArticleSource;)V", "component1", "()Lj$/time/Instant;", "Landroid/content/res/Resources;", "resources", "", "getPublishedAt", "(Landroid/content/res/Resources;)Ljava/lang/String;", "component2", "()Lcom/robinhood/android/cortex/models/ArticleSource;", "copy", "(Lj$/time/Instant;Lcom/robinhood/android/cortex/models/ArticleSource;)Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "Lcom/robinhood/android/cortex/models/ArticleSource;", "getArticleSource", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/HttpUrl;", "getUrl", "()Lokhttp3/HttpUrl;", "iconUrl", "Ljava/lang/String;", "getIconUrl", "publisher", "getPublisher", "title", "getTitle", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ArticleSourceContent {
        public static final int $stable = 8;
        private final ArticleSource articleSource;
        private final String iconUrl;
        private final Instant now;
        private final String publisher;
        private final String title;
        private final HttpUrl url;

        /* renamed from: component1, reason: from getter */
        private final Instant getNow() {
            return this.now;
        }

        public static /* synthetic */ ArticleSourceContent copy$default(ArticleSourceContent articleSourceContent, Instant instant, ArticleSource articleSource, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = articleSourceContent.now;
            }
            if ((i & 2) != 0) {
                articleSource = articleSourceContent.articleSource;
            }
            return articleSourceContent.copy(instant, articleSource);
        }

        /* renamed from: component2, reason: from getter */
        public final ArticleSource getArticleSource() {
            return this.articleSource;
        }

        public final ArticleSourceContent copy(Instant now, ArticleSource articleSource) {
            Intrinsics.checkNotNullParameter(now, "now");
            Intrinsics.checkNotNullParameter(articleSource, "articleSource");
            return new ArticleSourceContent(now, articleSource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArticleSourceContent)) {
                return false;
            }
            ArticleSourceContent articleSourceContent = (ArticleSourceContent) other;
            return Intrinsics.areEqual(this.now, articleSourceContent.now) && Intrinsics.areEqual(this.articleSource, articleSourceContent.articleSource);
        }

        public int hashCode() {
            return (this.now.hashCode() * 31) + this.articleSource.hashCode();
        }

        public String toString() {
            return "ArticleSourceContent(now=" + this.now + ", articleSource=" + this.articleSource + ")";
        }

        public ArticleSourceContent(Instant now, ArticleSource articleSource) {
            Intrinsics.checkNotNullParameter(now, "now");
            Intrinsics.checkNotNullParameter(articleSource, "articleSource");
            this.now = now;
            this.articleSource = articleSource;
            this.url = articleSource.getUrl();
            this.iconUrl = articleSource.getIconUrl();
            this.publisher = articleSource.getPublisher();
            this.title = articleSource.getTitle();
        }

        public final ArticleSource getArticleSource() {
            return this.articleSource;
        }

        public final HttpUrl getUrl() {
            return this.url;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getPublisher() {
            return this.publisher;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getPublishedAt(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Duration durationBetween = Duration.between(this.articleSource.getPublishedAt(), this.now);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            return DurationFormatter.formatNarrow(resources, durationBetween, true);
        }
    }
}
