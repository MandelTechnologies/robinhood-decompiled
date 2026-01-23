package com.robinhood.shared.crypto.p375ui.trade.review;

import com.robinhood.android.transfers.contracts.transfercontext.TransferContext3;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoReviewComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003J[\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/review/CryptoReviewState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "titleContentDisplay", "Lcom/robinhood/shared/crypto/ui/trade/review/CryptoReviewState$TitleContentDisplay;", "subtitle", "subtitleTrailingIcon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "messageAndDisclosuresState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "titleAutomationTestTag", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/crypto/ui/trade/review/CryptoReviewState$TitleContentDisplay;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/compose/bento/component/BentoIcons;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;Ljava/lang/String;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getTitleContentDisplay", "()Lcom/robinhood/shared/crypto/ui/trade/review/CryptoReviewState$TitleContentDisplay;", "getSubtitle", "getSubtitleTrailingIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getMessageAndDisclosuresState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "getTitleAutomationTestTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "TitleContentDisplay", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoReviewState {
    public static final int $stable;
    private final CryptoOrderReviewMessageAndDisclosuresState messageAndDisclosuresState;
    private final ImmutableList<CryptoOrderReviewRowState> rows;
    private final StringResource subtitle;
    private final BentoIcon4 subtitleTrailingIcon;
    private final StringResource title;
    private final String titleAutomationTestTag;
    private final TitleContentDisplay titleContentDisplay;

    static {
        int i = StringResource.$stable;
        int i2 = BentoIcon4.$stable;
        $stable = i | i2 | i | i2 | i2 | i | i2 | i | i2 | i | i2 | i | i2 | i | i;
    }

    public static /* synthetic */ CryptoReviewState copy$default(CryptoReviewState cryptoReviewState, StringResource stringResource, TitleContentDisplay titleContentDisplay, StringResource stringResource2, BentoIcon4 bentoIcon4, ImmutableList immutableList, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = cryptoReviewState.title;
        }
        if ((i & 2) != 0) {
            titleContentDisplay = cryptoReviewState.titleContentDisplay;
        }
        if ((i & 4) != 0) {
            stringResource2 = cryptoReviewState.subtitle;
        }
        if ((i & 8) != 0) {
            bentoIcon4 = cryptoReviewState.subtitleTrailingIcon;
        }
        if ((i & 16) != 0) {
            immutableList = cryptoReviewState.rows;
        }
        if ((i & 32) != 0) {
            cryptoOrderReviewMessageAndDisclosuresState = cryptoReviewState.messageAndDisclosuresState;
        }
        if ((i & 64) != 0) {
            str = cryptoReviewState.titleAutomationTestTag;
        }
        CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState2 = cryptoOrderReviewMessageAndDisclosuresState;
        String str2 = str;
        ImmutableList immutableList2 = immutableList;
        StringResource stringResource3 = stringResource2;
        return cryptoReviewState.copy(stringResource, titleContentDisplay, stringResource3, bentoIcon4, immutableList2, cryptoOrderReviewMessageAndDisclosuresState2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TitleContentDisplay getTitleContentDisplay() {
        return this.titleContentDisplay;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final BentoIcon4 getSubtitleTrailingIcon() {
        return this.subtitleTrailingIcon;
    }

    public final ImmutableList<CryptoOrderReviewRowState> component5() {
        return this.rows;
    }

    /* renamed from: component6, reason: from getter */
    public final CryptoOrderReviewMessageAndDisclosuresState getMessageAndDisclosuresState() {
        return this.messageAndDisclosuresState;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTitleAutomationTestTag() {
        return this.titleAutomationTestTag;
    }

    public final CryptoReviewState copy(StringResource title, TitleContentDisplay titleContentDisplay, StringResource subtitle, BentoIcon4 subtitleTrailingIcon, ImmutableList<CryptoOrderReviewRowState> rows, CryptoOrderReviewMessageAndDisclosuresState messageAndDisclosuresState, String titleAutomationTestTag) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleContentDisplay, "titleContentDisplay");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(messageAndDisclosuresState, "messageAndDisclosuresState");
        return new CryptoReviewState(title, titleContentDisplay, subtitle, subtitleTrailingIcon, rows, messageAndDisclosuresState, titleAutomationTestTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoReviewState)) {
            return false;
        }
        CryptoReviewState cryptoReviewState = (CryptoReviewState) other;
        return Intrinsics.areEqual(this.title, cryptoReviewState.title) && this.titleContentDisplay == cryptoReviewState.titleContentDisplay && Intrinsics.areEqual(this.subtitle, cryptoReviewState.subtitle) && Intrinsics.areEqual(this.subtitleTrailingIcon, cryptoReviewState.subtitleTrailingIcon) && Intrinsics.areEqual(this.rows, cryptoReviewState.rows) && Intrinsics.areEqual(this.messageAndDisclosuresState, cryptoReviewState.messageAndDisclosuresState) && Intrinsics.areEqual(this.titleAutomationTestTag, cryptoReviewState.titleAutomationTestTag);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.titleContentDisplay.hashCode()) * 31;
        StringResource stringResource = this.subtitle;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        BentoIcon4 bentoIcon4 = this.subtitleTrailingIcon;
        int iHashCode3 = (((((iHashCode2 + (bentoIcon4 == null ? 0 : bentoIcon4.hashCode())) * 31) + this.rows.hashCode()) * 31) + this.messageAndDisclosuresState.hashCode()) * 31;
        String str = this.titleAutomationTestTag;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CryptoReviewState(title=" + this.title + ", titleContentDisplay=" + this.titleContentDisplay + ", subtitle=" + this.subtitle + ", subtitleTrailingIcon=" + this.subtitleTrailingIcon + ", rows=" + this.rows + ", messageAndDisclosuresState=" + this.messageAndDisclosuresState + ", titleAutomationTestTag=" + this.titleAutomationTestTag + ")";
    }

    public CryptoReviewState(StringResource title, TitleContentDisplay titleContentDisplay, StringResource stringResource, BentoIcon4 bentoIcon4, ImmutableList<CryptoOrderReviewRowState> rows, CryptoOrderReviewMessageAndDisclosuresState messageAndDisclosuresState, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleContentDisplay, "titleContentDisplay");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(messageAndDisclosuresState, "messageAndDisclosuresState");
        this.title = title;
        this.titleContentDisplay = titleContentDisplay;
        this.subtitle = stringResource;
        this.subtitleTrailingIcon = bentoIcon4;
        this.rows = rows;
        this.messageAndDisclosuresState = messageAndDisclosuresState;
        this.titleAutomationTestTag = str;
    }

    public /* synthetic */ CryptoReviewState(StringResource stringResource, TitleContentDisplay titleContentDisplay, StringResource stringResource2, BentoIcon4 bentoIcon4, ImmutableList immutableList, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, titleContentDisplay, stringResource2, bentoIcon4, immutableList, cryptoOrderReviewMessageAndDisclosuresState, (i & 64) != 0 ? null : str);
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final TitleContentDisplay getTitleContentDisplay() {
        return this.titleContentDisplay;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final BentoIcon4 getSubtitleTrailingIcon() {
        return this.subtitleTrailingIcon;
    }

    public final ImmutableList<CryptoOrderReviewRowState> getRows() {
        return this.rows;
    }

    public final CryptoOrderReviewMessageAndDisclosuresState getMessageAndDisclosuresState() {
        return this.messageAndDisclosuresState;
    }

    public final String getTitleAutomationTestTag() {
        return this.titleAutomationTestTag;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoReviewComposable.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/review/CryptoReviewState$TitleContentDisplay;", "", "<init>", "(Ljava/lang/String;I)V", TransferContext3.NORMAL, "LARGE_CENTERED", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TitleContentDisplay {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TitleContentDisplay[] $VALUES;
        public static final TitleContentDisplay NORMAL = new TitleContentDisplay(TransferContext3.NORMAL, 0);
        public static final TitleContentDisplay LARGE_CENTERED = new TitleContentDisplay("LARGE_CENTERED", 1);

        private static final /* synthetic */ TitleContentDisplay[] $values() {
            return new TitleContentDisplay[]{NORMAL, LARGE_CENTERED};
        }

        public static EnumEntries<TitleContentDisplay> getEntries() {
            return $ENTRIES;
        }

        private TitleContentDisplay(String str, int i) {
        }

        static {
            TitleContentDisplay[] titleContentDisplayArr$values = $values();
            $VALUES = titleContentDisplayArr$values;
            $ENTRIES = EnumEntries2.enumEntries(titleContentDisplayArr$values);
        }

        public static TitleContentDisplay valueOf(String str) {
            return (TitleContentDisplay) Enum.valueOf(TitleContentDisplay.class, str);
        }

        public static TitleContentDisplay[] values() {
            return (TitleContentDisplay[]) $VALUES.clone();
        }
    }
}
