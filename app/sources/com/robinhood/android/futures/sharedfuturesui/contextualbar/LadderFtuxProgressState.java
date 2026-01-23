package com.robinhood.android.futures.sharedfuturesui.contextualbar;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.layout.ContentScale;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.sharedfuturesui.C17449R;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderFtuxProgressState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;", "Landroid/os/Parcelable;", "lottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "nextState", "contractTitle", "", "prevState", "prefetchLottie", "", "context", "Landroid/content/Context;", "isDay", "", "LadderEducation", "TransitionToLadderUi", "LottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$TransitionToLadderUi;", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface LadderFtuxProgressState extends Parcelable {
    LottieAnimationSpec getLottieAnimationSpec();

    LadderFtuxProgressState nextState(String contractTitle);

    void prefetchLottie(Context context, boolean isDay);

    LadderFtuxProgressState prevState();

    /* compiled from: LadderFtuxProgressState.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u000b\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f BC\b\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u000b!\"#$%&'()*+¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData;", "ladderEducationDescription", "", "ladderEducationDescriptionSubText", "primaryButtonType", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType;", "secondaryButtonType", "showAppBarTitle", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType;Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType;Z)V", "getLadderEducationDescription", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLadderEducationDescriptionSubText", "getPrimaryButtonType", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData$ButtonType;", "getSecondaryButtonType", "getShowAppBarTitle", "()Z", "LadderIntroduction", "LastTradedPriceInformation", "TickSizeInformation", "BidBarsInformation", "AskBarsInformation", "MarketOrderInformation", "LadderRowOrderInformation", "LadderRowEditOrder", "LadderRowCancelOrder", "LadderRowAveragePrice", "LadderRowClosePosition", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$AskBarsInformation;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$BidBarsInformation;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LadderIntroduction;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LadderRowAveragePrice;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LadderRowCancelOrder;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LadderRowClosePosition;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LadderRowEditOrder;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LadderRowOrderInformation;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LastTradedPriceInformation;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$MarketOrderInformation;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$TickSizeInformation;", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class LadderEducation extends FtuxContextualBarData implements LadderFtuxProgressState {
        public static final int $stable = 0;
        private final Integer ladderEducationDescription;
        private final Integer ladderEducationDescriptionSubText;
        private final FtuxContextualBarData.ButtonType primaryButtonType;
        private final FtuxContextualBarData.ButtonType secondaryButtonType;
        private final boolean showAppBarTitle;

        public /* synthetic */ LadderEducation(Integer num, Integer num2, FtuxContextualBarData.ButtonType buttonType, FtuxContextualBarData.ButtonType buttonType2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, num2, buttonType, buttonType2, z);
        }

        @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
        public LadderFtuxProgressState nextState(String str) {
            return DefaultImpls.nextState(this, str);
        }

        @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
        public void prefetchLottie(Context context, boolean z) {
            DefaultImpls.prefetchLottie(this, context, z);
        }

        @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
        public LadderFtuxProgressState prevState() {
            return DefaultImpls.prevState(this);
        }

        public final Integer getLadderEducationDescription() {
            return this.ladderEducationDescription;
        }

        public final Integer getLadderEducationDescriptionSubText() {
            return this.ladderEducationDescriptionSubText;
        }

        public /* synthetic */ LadderEducation(Integer num, Integer num2, FtuxContextualBarData.ButtonType buttonType, FtuxContextualBarData.ButtonType buttonType2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? new FtuxContextualBarData.ButtonType.IconButton(ServerToBentoAssetMapper2.ARROW_RIGHT_24, C17449R.string.futures_ladder_ftux_continue_content_description, null, 4, null) : buttonType, (i & 8) != 0 ? new FtuxContextualBarData.ButtonType.IconButton(ServerToBentoAssetMapper2.ARROW_LEFT_24, C17449R.string.futures_ladder_ftux_back_content_description, BentoIconButton4.Type.Secondary) : buttonType2, (i & 16) != 0 ? true : z, null);
        }

        public final FtuxContextualBarData.ButtonType getPrimaryButtonType() {
            return this.primaryButtonType;
        }

        public final FtuxContextualBarData.ButtonType getSecondaryButtonType() {
            return this.secondaryButtonType;
        }

        public final boolean getShowAppBarTitle() {
            return this.showAppBarTitle;
        }

        private LadderEducation(Integer num, Integer num2, FtuxContextualBarData.ButtonType buttonType, FtuxContextualBarData.ButtonType buttonType2, boolean z) {
            super(num, num2, buttonType, buttonType2);
            this.ladderEducationDescription = num;
            this.ladderEducationDescriptionSubText = num2;
            this.primaryButtonType = buttonType;
            this.secondaryButtonType = buttonType2;
            this.showAppBarTitle = z;
        }

        /* compiled from: LadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LadderIntroduction;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LadderIntroduction extends LadderEducation {
            public static final int $stable = 0;
            public static final LadderIntroduction INSTANCE = new LadderIntroduction();
            public static final Parcelable.Creator<LadderIntroduction> CREATOR = new Creator();

            /* compiled from: LadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<LadderIntroduction> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LadderIntroduction createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LadderIntroduction.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LadderIntroduction[] newArray(int i) {
                    return new LadderIntroduction[i];
                }
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LadderIntroduction);
            }

            public int hashCode() {
                return -140993010;
            }

            public String toString() {
                return "LadderIntroduction";
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private LadderIntroduction() {
                super(Integer.valueOf(C17449R.string.futures_ladder_ftux_introduction), null, new FtuxContextualBarData.ButtonType.TextButton(StringResource.INSTANCE.invoke(C17449R.string.futures_ladder_ftux_start_ladder_education_button_label, new Object[0])), null, false, 2, null);
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
            public LottieAnimationSpec getLottieAnimationSpec() {
                return new LottieAnimationSpec(LottieUrl.FUTURES_LADDER_FTUX_CHART_EDUCATION_DAY, LottieUrl.FUTURES_LADDER_FTUX_CHART_EDUCATION_NIGHT, ContentScale.INSTANCE.getFillWidth(), 0, Tuples4.m3642to(85, Integer.valueOf(EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE)), 8, null);
            }
        }

        /* compiled from: LadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LastTradedPriceInformation;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LastTradedPriceInformation extends LadderEducation {
            public static final int $stable = 0;
            public static final LastTradedPriceInformation INSTANCE = new LastTradedPriceInformation();
            public static final Parcelable.Creator<LastTradedPriceInformation> CREATOR = new Creator();

            /* compiled from: LadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<LastTradedPriceInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LastTradedPriceInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LastTradedPriceInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LastTradedPriceInformation[] newArray(int i) {
                    return new LastTradedPriceInformation[i];
                }
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LastTradedPriceInformation);
            }

            public int hashCode() {
                return 638647467;
            }

            public String toString() {
                return "LastTradedPriceInformation";
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private LastTradedPriceInformation() {
                super(Integer.valueOf(C17449R.string.futures_ladder_ftux_last_traded_price_description), Integer.valueOf(C17449R.string.futures_ladder_ftux_last_traded_price_description_subtext), null, null, false, 28, null);
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
            public LottieAnimationSpec getLottieAnimationSpec() {
                return new LottieAnimationSpec(LottieUrl.FUTURES_LADDER_FTUX_LAST_TRADED_PRICE_DAY, LottieUrl.FUTURES_LADDER_FTUX_LAST_TRADED_PRICE_NIGHT, null, 0, null, 28, null);
            }
        }

        /* compiled from: LadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$TickSizeInformation;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TickSizeInformation extends LadderEducation {
            public static final int $stable = 0;
            public static final TickSizeInformation INSTANCE = new TickSizeInformation();
            public static final Parcelable.Creator<TickSizeInformation> CREATOR = new Creator();

            /* compiled from: LadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<TickSizeInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TickSizeInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TickSizeInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TickSizeInformation[] newArray(int i) {
                    return new TickSizeInformation[i];
                }
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof TickSizeInformation);
            }

            public int hashCode() {
                return 1700298908;
            }

            public String toString() {
                return "TickSizeInformation";
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private TickSizeInformation() {
                super(Integer.valueOf(C17449R.string.futures_ladder_ftux_tick_size_description), null, null, null, false, 30, null);
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
            public LottieAnimationSpec getLottieAnimationSpec() {
                return new LottieAnimationSpec(LottieUrl.FUTURES_LADDER_FTUX_TICK_SIZE_DAY, LottieUrl.FUTURES_LADDER_FTUX_TICK_SIZE_NIGHT, null, 0, null, 28, null);
            }
        }

        /* compiled from: LadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$BidBarsInformation;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BidBarsInformation extends LadderEducation {
            public static final int $stable = 0;
            public static final BidBarsInformation INSTANCE = new BidBarsInformation();
            public static final Parcelable.Creator<BidBarsInformation> CREATOR = new Creator();

            /* compiled from: LadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<BidBarsInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BidBarsInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BidBarsInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BidBarsInformation[] newArray(int i) {
                    return new BidBarsInformation[i];
                }
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof BidBarsInformation);
            }

            public int hashCode() {
                return 1083650113;
            }

            public String toString() {
                return "BidBarsInformation";
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private BidBarsInformation() {
                super(Integer.valueOf(C17449R.string.futures_ladder_ftux_bid_bars_description), null, null, null, false, 30, null);
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
            public LottieAnimationSpec getLottieAnimationSpec() {
                return new LottieAnimationSpec(LottieUrl.FUTURES_LADDER_FTUX_BID_BARS_DAY, LottieUrl.FUTURES_LADDER_FTUX_BID_BARS_NIGHT, null, 0, null, 28, null);
            }
        }

        /* compiled from: LadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$AskBarsInformation;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AskBarsInformation extends LadderEducation {
            public static final int $stable = 0;
            public static final AskBarsInformation INSTANCE = new AskBarsInformation();
            public static final Parcelable.Creator<AskBarsInformation> CREATOR = new Creator();

            /* compiled from: LadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<AskBarsInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AskBarsInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AskBarsInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AskBarsInformation[] newArray(int i) {
                    return new AskBarsInformation[i];
                }
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AskBarsInformation);
            }

            public int hashCode() {
                return -844821691;
            }

            public String toString() {
                return "AskBarsInformation";
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private AskBarsInformation() {
                super(Integer.valueOf(C17449R.string.futures_ladder_ftux_ask_bars_description), null, null, null, false, 30, null);
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
            public LottieAnimationSpec getLottieAnimationSpec() {
                return new LottieAnimationSpec(LottieUrl.FUTURES_LADDER_FTUX_ASK_BARS_DAY, LottieUrl.FUTURES_LADDER_FTUX_ASK_BARS_NIGHT, null, 0, null, 28, null);
            }
        }

        /* compiled from: LadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$MarketOrderInformation;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MarketOrderInformation extends LadderEducation {
            public static final int $stable = 0;
            public static final MarketOrderInformation INSTANCE = new MarketOrderInformation();
            public static final Parcelable.Creator<MarketOrderInformation> CREATOR = new Creator();

            /* compiled from: LadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<MarketOrderInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MarketOrderInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return MarketOrderInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MarketOrderInformation[] newArray(int i) {
                    return new MarketOrderInformation[i];
                }
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof MarketOrderInformation);
            }

            public int hashCode() {
                return 1243128076;
            }

            public String toString() {
                return "MarketOrderInformation";
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private MarketOrderInformation() {
                super(Integer.valueOf(C17449R.string.futures_ladder_ftux_market_orders_description), null, null, null, false, 30, null);
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
            public LottieAnimationSpec getLottieAnimationSpec() {
                return new LottieAnimationSpec(LottieUrl.FUTURES_LADDER_FTUX_MARKET_ORDER_DAY, LottieUrl.FUTURES_LADDER_FTUX_MARKET_ORDER_NIGHT, null, 0, null, 28, null);
            }
        }

        /* compiled from: LadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LadderRowOrderInformation;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LadderRowOrderInformation extends LadderEducation {
            public static final int $stable = 0;
            public static final LadderRowOrderInformation INSTANCE = new LadderRowOrderInformation();
            public static final Parcelable.Creator<LadderRowOrderInformation> CREATOR = new Creator();

            /* compiled from: LadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<LadderRowOrderInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LadderRowOrderInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LadderRowOrderInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LadderRowOrderInformation[] newArray(int i) {
                    return new LadderRowOrderInformation[i];
                }
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LadderRowOrderInformation);
            }

            public int hashCode() {
                return 1801618052;
            }

            public String toString() {
                return "LadderRowOrderInformation";
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private LadderRowOrderInformation() {
                super(Integer.valueOf(C17449R.string.futures_ladder_ftux_ladder_row_buy_and_sell_description), null, null, null, false, 30, null);
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
            public LottieAnimationSpec getLottieAnimationSpec() {
                return new LottieAnimationSpec(LottieUrl.FUTURES_LADDER_FTUX_ROW_DAY, LottieUrl.FUTURES_LADDER_FTUX_ROW_NIGHT, null, 0, null, 28, null);
            }
        }

        /* compiled from: LadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LadderRowEditOrder;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LadderRowEditOrder extends LadderEducation {
            public static final int $stable = 0;
            public static final LadderRowEditOrder INSTANCE = new LadderRowEditOrder();
            public static final Parcelable.Creator<LadderRowEditOrder> CREATOR = new Creator();

            /* compiled from: LadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<LadderRowEditOrder> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LadderRowEditOrder createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LadderRowEditOrder.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LadderRowEditOrder[] newArray(int i) {
                    return new LadderRowEditOrder[i];
                }
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LadderRowEditOrder);
            }

            public int hashCode() {
                return 764641438;
            }

            public String toString() {
                return "LadderRowEditOrder";
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private LadderRowEditOrder() {
                super(Integer.valueOf(C17449R.string.futures_ladder_ftux_ladder_row_edit_order_description), null, null, null, false, 30, null);
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
            public LottieAnimationSpec getLottieAnimationSpec() {
                return new LottieAnimationSpec(LottieUrl.FUTURES_LADDER_FTUX_EDIT_ORDER_DAY, LottieUrl.FUTURES_LADDER_FTUX_EDIT_ORDER_NIGHT, null, Integer.MAX_VALUE, null, 20, null);
            }
        }

        /* compiled from: LadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LadderRowCancelOrder;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LadderRowCancelOrder extends LadderEducation {
            public static final int $stable = 0;
            public static final LadderRowCancelOrder INSTANCE = new LadderRowCancelOrder();
            public static final Parcelable.Creator<LadderRowCancelOrder> CREATOR = new Creator();

            /* compiled from: LadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<LadderRowCancelOrder> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LadderRowCancelOrder createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LadderRowCancelOrder.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LadderRowCancelOrder[] newArray(int i) {
                    return new LadderRowCancelOrder[i];
                }
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LadderRowCancelOrder);
            }

            public int hashCode() {
                return -1881399378;
            }

            public String toString() {
                return "LadderRowCancelOrder";
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private LadderRowCancelOrder() {
                super(Integer.valueOf(C17449R.string.futures_ladder_ftux_ladder_row_cancel_order_description), null, null, null, false, 30, null);
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
            public LottieAnimationSpec getLottieAnimationSpec() {
                return new LottieAnimationSpec(LottieUrl.FUTURES_LADDER_FTUX_CANCEL_DAY, LottieUrl.FUTURES_LADDER_FTUX_CANCEL_NIGHT, null, Integer.MAX_VALUE, null, 20, null);
            }
        }

        /* compiled from: LadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LadderRowAveragePrice;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LadderRowAveragePrice extends LadderEducation {
            public static final int $stable = 0;
            public static final LadderRowAveragePrice INSTANCE = new LadderRowAveragePrice();
            public static final Parcelable.Creator<LadderRowAveragePrice> CREATOR = new Creator();

            /* compiled from: LadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<LadderRowAveragePrice> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LadderRowAveragePrice createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LadderRowAveragePrice.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LadderRowAveragePrice[] newArray(int i) {
                    return new LadderRowAveragePrice[i];
                }
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LadderRowAveragePrice);
            }

            public int hashCode() {
                return 673368498;
            }

            public String toString() {
                return "LadderRowAveragePrice";
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private LadderRowAveragePrice() {
                super(Integer.valueOf(C17449R.string.futures_ladder_ftux_ladder_average_price_description), null, null, null, false, 30, null);
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
            public LottieAnimationSpec getLottieAnimationSpec() {
                return new LottieAnimationSpec(LottieUrl.FUTURES_LADDER_FTUX_AVG_PRICE_DAY, LottieUrl.FUTURES_LADDER_FTUX_AVG_PRICE_NIGHT, null, 0, null, 28, null);
            }
        }

        /* compiled from: LadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation$LadderRowClosePosition;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LadderEducation;", "contractTitle", "", "<init>", "(Ljava/lang/String;)V", "getContractTitle", "()Ljava/lang/String;", "lottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LadderRowClosePosition extends LadderEducation {
            public static final int $stable = 0;
            public static final Parcelable.Creator<LadderRowClosePosition> CREATOR = new Creator();
            private final String contractTitle;

            /* compiled from: LadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<LadderRowClosePosition> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LadderRowClosePosition createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LadderRowClosePosition(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LadderRowClosePosition[] newArray(int i) {
                    return new LadderRowClosePosition[i];
                }
            }

            public static /* synthetic */ LadderRowClosePosition copy$default(LadderRowClosePosition ladderRowClosePosition, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = ladderRowClosePosition.contractTitle;
                }
                return ladderRowClosePosition.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getContractTitle() {
                return this.contractTitle;
            }

            public final LadderRowClosePosition copy(String contractTitle) {
                return new LadderRowClosePosition(contractTitle);
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LadderRowClosePosition) && Intrinsics.areEqual(this.contractTitle, ((LadderRowClosePosition) other).contractTitle);
            }

            public int hashCode() {
                String str = this.contractTitle;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "LadderRowClosePosition(contractTitle=" + this.contractTitle + ")";
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.contractTitle);
            }

            public final String getContractTitle() {
                return this.contractTitle;
            }

            public LadderRowClosePosition(String str) {
                StringResource stringResourceInvoke;
                super(Integer.valueOf(C17449R.string.futures_ladder_ftux_ladder_close_positions_description), null, new FtuxContextualBarData.ButtonType.TextButton((str == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(C17449R.string.futures_ladder_ftux_start_trading_contract_button_label, str)) == null) ? StringResource.INSTANCE.invoke(C17449R.string.futures_ladder_ftux_start_trading_button_label, new Object[0]) : stringResourceInvoke), null, false, 18, null);
                this.contractTitle = str;
            }

            @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
            public LottieAnimationSpec getLottieAnimationSpec() {
                return new LottieAnimationSpec(LottieUrl.FUTURES_LADDER_FTUX_CLOSE_POSITION_DAY, LottieUrl.FUTURES_LADDER_FTUX_CLOSE_POSITION_NIGHT, null, 0, null, 28, null);
            }
        }
    }

    /* compiled from: LadderFtuxProgressState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$TransitionToLadderUi;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransitionToLadderUi implements LadderFtuxProgressState {
        public static final int $stable = 0;
        public static final TransitionToLadderUi INSTANCE = new TransitionToLadderUi();
        public static final Parcelable.Creator<TransitionToLadderUi> CREATOR = new Creator();

        /* compiled from: LadderFtuxProgressState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<TransitionToLadderUi> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransitionToLadderUi createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransitionToLadderUi.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransitionToLadderUi[] newArray(int i) {
                return new TransitionToLadderUi[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TransitionToLadderUi);
        }

        public int hashCode() {
            return 1351945712;
        }

        public String toString() {
            return "TransitionToLadderUi";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private TransitionToLadderUi() {
        }

        @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
        public LadderFtuxProgressState nextState(String str) {
            return DefaultImpls.nextState(this, str);
        }

        @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
        public void prefetchLottie(Context context, boolean z) {
            DefaultImpls.prefetchLottie(this, context, z);
        }

        @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
        public LadderFtuxProgressState prevState() {
            return DefaultImpls.prevState(this);
        }

        @Override // com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState
        public LottieAnimationSpec getLottieAnimationSpec() {
            return new LottieAnimationSpec(LottieUrl.FUTURES_LADDER_FTUX_LOADER_DAY, LottieUrl.FUTURES_LADDER_FTUX_LOADER_NIGHT, null, 2, null, 20, null);
        }
    }

    /* compiled from: LadderFtuxProgressState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static LadderFtuxProgressState nextState(LadderFtuxProgressState ladderFtuxProgressState, String str) {
            if (Intrinsics.areEqual(ladderFtuxProgressState, LadderEducation.LadderIntroduction.INSTANCE)) {
                return LadderEducation.LastTradedPriceInformation.INSTANCE;
            }
            if (Intrinsics.areEqual(ladderFtuxProgressState, LadderEducation.LastTradedPriceInformation.INSTANCE)) {
                return LadderEducation.TickSizeInformation.INSTANCE;
            }
            if (Intrinsics.areEqual(ladderFtuxProgressState, LadderEducation.TickSizeInformation.INSTANCE)) {
                return LadderEducation.BidBarsInformation.INSTANCE;
            }
            if (Intrinsics.areEqual(ladderFtuxProgressState, LadderEducation.BidBarsInformation.INSTANCE)) {
                return LadderEducation.AskBarsInformation.INSTANCE;
            }
            if (Intrinsics.areEqual(ladderFtuxProgressState, LadderEducation.AskBarsInformation.INSTANCE)) {
                return LadderEducation.MarketOrderInformation.INSTANCE;
            }
            if (Intrinsics.areEqual(ladderFtuxProgressState, LadderEducation.MarketOrderInformation.INSTANCE)) {
                return LadderEducation.LadderRowOrderInformation.INSTANCE;
            }
            if (Intrinsics.areEqual(ladderFtuxProgressState, LadderEducation.LadderRowOrderInformation.INSTANCE)) {
                return LadderEducation.LadderRowEditOrder.INSTANCE;
            }
            if (Intrinsics.areEqual(ladderFtuxProgressState, LadderEducation.LadderRowEditOrder.INSTANCE)) {
                return LadderEducation.LadderRowCancelOrder.INSTANCE;
            }
            if (Intrinsics.areEqual(ladderFtuxProgressState, LadderEducation.LadderRowCancelOrder.INSTANCE)) {
                return LadderEducation.LadderRowAveragePrice.INSTANCE;
            }
            if (Intrinsics.areEqual(ladderFtuxProgressState, LadderEducation.LadderRowAveragePrice.INSTANCE)) {
                return new LadderEducation.LadderRowClosePosition(str);
            }
            if (ladderFtuxProgressState instanceof LadderEducation.LadderRowClosePosition) {
                return TransitionToLadderUi.INSTANCE;
            }
            if (Intrinsics.areEqual(ladderFtuxProgressState, TransitionToLadderUi.INSTANCE)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static LadderFtuxProgressState prevState(LadderFtuxProgressState ladderFtuxProgressState) {
            LadderEducation.LadderIntroduction ladderIntroduction = LadderEducation.LadderIntroduction.INSTANCE;
            if (Intrinsics.areEqual(ladderFtuxProgressState, ladderIntroduction)) {
                return null;
            }
            LadderEducation.LastTradedPriceInformation lastTradedPriceInformation = LadderEducation.LastTradedPriceInformation.INSTANCE;
            if (Intrinsics.areEqual(ladderFtuxProgressState, lastTradedPriceInformation)) {
                return ladderIntroduction;
            }
            LadderEducation.TickSizeInformation tickSizeInformation = LadderEducation.TickSizeInformation.INSTANCE;
            if (Intrinsics.areEqual(ladderFtuxProgressState, tickSizeInformation)) {
                return lastTradedPriceInformation;
            }
            LadderEducation.BidBarsInformation bidBarsInformation = LadderEducation.BidBarsInformation.INSTANCE;
            if (Intrinsics.areEqual(ladderFtuxProgressState, bidBarsInformation)) {
                return tickSizeInformation;
            }
            LadderEducation.AskBarsInformation askBarsInformation = LadderEducation.AskBarsInformation.INSTANCE;
            if (Intrinsics.areEqual(ladderFtuxProgressState, askBarsInformation)) {
                return bidBarsInformation;
            }
            LadderEducation.MarketOrderInformation marketOrderInformation = LadderEducation.MarketOrderInformation.INSTANCE;
            if (Intrinsics.areEqual(ladderFtuxProgressState, marketOrderInformation)) {
                return askBarsInformation;
            }
            LadderEducation.LadderRowOrderInformation ladderRowOrderInformation = LadderEducation.LadderRowOrderInformation.INSTANCE;
            if (Intrinsics.areEqual(ladderFtuxProgressState, ladderRowOrderInformation)) {
                return marketOrderInformation;
            }
            LadderEducation.LadderRowEditOrder ladderRowEditOrder = LadderEducation.LadderRowEditOrder.INSTANCE;
            if (Intrinsics.areEqual(ladderFtuxProgressState, ladderRowEditOrder)) {
                return ladderRowOrderInformation;
            }
            LadderEducation.LadderRowCancelOrder ladderRowCancelOrder = LadderEducation.LadderRowCancelOrder.INSTANCE;
            if (Intrinsics.areEqual(ladderFtuxProgressState, ladderRowCancelOrder)) {
                return ladderRowEditOrder;
            }
            LadderEducation.LadderRowAveragePrice ladderRowAveragePrice = LadderEducation.LadderRowAveragePrice.INSTANCE;
            if (Intrinsics.areEqual(ladderFtuxProgressState, ladderRowAveragePrice)) {
                return ladderRowCancelOrder;
            }
            if (ladderFtuxProgressState instanceof LadderEducation.LadderRowClosePosition) {
                return ladderRowAveragePrice;
            }
            if (Intrinsics.areEqual(ladderFtuxProgressState, TransitionToLadderUi.INSTANCE)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static void prefetchLottie(LadderFtuxProgressState ladderFtuxProgressState, Context context, boolean z) {
            LottieUrl nightThemeLottieUrl;
            Intrinsics.checkNotNullParameter(context, "context");
            if (z) {
                nightThemeLottieUrl = ladderFtuxProgressState.getLottieAnimationSpec().getDayThemeLottieUrl();
            } else {
                nightThemeLottieUrl = ladderFtuxProgressState.getLottieAnimationSpec().getNightThemeLottieUrl();
            }
            nightThemeLottieUrl.prefetch(context);
        }
    }

    /* compiled from: LadderFtuxProgressState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState$LottieAnimationSpec;", "", "dayThemeLottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "nightThemeLottieUrl", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "lottieIterations", "", "loopIntervalFrames", "Lkotlin/Pair;", "<init>", "(Lcom/robinhood/shared/remote/assets/LottieUrl;Lcom/robinhood/shared/remote/assets/LottieUrl;Landroidx/compose/ui/layout/ContentScale;ILkotlin/Pair;)V", "getDayThemeLottieUrl", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "getNightThemeLottieUrl", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "getLottieIterations", "()I", "getLoopIntervalFrames", "()Lkotlin/Pair;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LottieAnimationSpec {
        public static final int $stable = 0;
        private final ContentScale contentScale;
        private final LottieUrl dayThemeLottieUrl;
        private final Tuples2<Integer, Integer> loopIntervalFrames;
        private final int lottieIterations;
        private final LottieUrl nightThemeLottieUrl;

        public static /* synthetic */ LottieAnimationSpec copy$default(LottieAnimationSpec lottieAnimationSpec, LottieUrl lottieUrl, LottieUrl lottieUrl2, ContentScale contentScale, int i, Tuples2 tuples2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                lottieUrl = lottieAnimationSpec.dayThemeLottieUrl;
            }
            if ((i2 & 2) != 0) {
                lottieUrl2 = lottieAnimationSpec.nightThemeLottieUrl;
            }
            if ((i2 & 4) != 0) {
                contentScale = lottieAnimationSpec.contentScale;
            }
            if ((i2 & 8) != 0) {
                i = lottieAnimationSpec.lottieIterations;
            }
            if ((i2 & 16) != 0) {
                tuples2 = lottieAnimationSpec.loopIntervalFrames;
            }
            Tuples2 tuples22 = tuples2;
            ContentScale contentScale2 = contentScale;
            return lottieAnimationSpec.copy(lottieUrl, lottieUrl2, contentScale2, i, tuples22);
        }

        /* renamed from: component1, reason: from getter */
        public final LottieUrl getDayThemeLottieUrl() {
            return this.dayThemeLottieUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final LottieUrl getNightThemeLottieUrl() {
            return this.nightThemeLottieUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final ContentScale getContentScale() {
            return this.contentScale;
        }

        /* renamed from: component4, reason: from getter */
        public final int getLottieIterations() {
            return this.lottieIterations;
        }

        public final Tuples2<Integer, Integer> component5() {
            return this.loopIntervalFrames;
        }

        public final LottieAnimationSpec copy(LottieUrl dayThemeLottieUrl, LottieUrl nightThemeLottieUrl, ContentScale contentScale, int lottieIterations, Tuples2<Integer, Integer> loopIntervalFrames) {
            Intrinsics.checkNotNullParameter(dayThemeLottieUrl, "dayThemeLottieUrl");
            Intrinsics.checkNotNullParameter(nightThemeLottieUrl, "nightThemeLottieUrl");
            Intrinsics.checkNotNullParameter(contentScale, "contentScale");
            return new LottieAnimationSpec(dayThemeLottieUrl, nightThemeLottieUrl, contentScale, lottieIterations, loopIntervalFrames);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LottieAnimationSpec)) {
                return false;
            }
            LottieAnimationSpec lottieAnimationSpec = (LottieAnimationSpec) other;
            return this.dayThemeLottieUrl == lottieAnimationSpec.dayThemeLottieUrl && this.nightThemeLottieUrl == lottieAnimationSpec.nightThemeLottieUrl && Intrinsics.areEqual(this.contentScale, lottieAnimationSpec.contentScale) && this.lottieIterations == lottieAnimationSpec.lottieIterations && Intrinsics.areEqual(this.loopIntervalFrames, lottieAnimationSpec.loopIntervalFrames);
        }

        public int hashCode() {
            int iHashCode = ((((((this.dayThemeLottieUrl.hashCode() * 31) + this.nightThemeLottieUrl.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Integer.hashCode(this.lottieIterations)) * 31;
            Tuples2<Integer, Integer> tuples2 = this.loopIntervalFrames;
            return iHashCode + (tuples2 == null ? 0 : tuples2.hashCode());
        }

        public String toString() {
            return "LottieAnimationSpec(dayThemeLottieUrl=" + this.dayThemeLottieUrl + ", nightThemeLottieUrl=" + this.nightThemeLottieUrl + ", contentScale=" + this.contentScale + ", lottieIterations=" + this.lottieIterations + ", loopIntervalFrames=" + this.loopIntervalFrames + ")";
        }

        public LottieAnimationSpec(LottieUrl dayThemeLottieUrl, LottieUrl nightThemeLottieUrl, ContentScale contentScale, int i, Tuples2<Integer, Integer> tuples2) {
            Intrinsics.checkNotNullParameter(dayThemeLottieUrl, "dayThemeLottieUrl");
            Intrinsics.checkNotNullParameter(nightThemeLottieUrl, "nightThemeLottieUrl");
            Intrinsics.checkNotNullParameter(contentScale, "contentScale");
            this.dayThemeLottieUrl = dayThemeLottieUrl;
            this.nightThemeLottieUrl = nightThemeLottieUrl;
            this.contentScale = contentScale;
            this.lottieIterations = i;
            this.loopIntervalFrames = tuples2;
        }

        public final LottieUrl getDayThemeLottieUrl() {
            return this.dayThemeLottieUrl;
        }

        public final LottieUrl getNightThemeLottieUrl() {
            return this.nightThemeLottieUrl;
        }

        public /* synthetic */ LottieAnimationSpec(LottieUrl lottieUrl, LottieUrl lottieUrl2, ContentScale contentScale, int i, Tuples2 tuples2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(lottieUrl, lottieUrl2, (i2 & 4) != 0 ? ContentScale.INSTANCE.getFit() : contentScale, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? null : tuples2);
        }

        public final ContentScale getContentScale() {
            return this.contentScale;
        }

        public final int getLottieIterations() {
            return this.lottieIterations;
        }

        public final Tuples2<Integer, Integer> getLoopIntervalFrames() {
            return this.loopIntervalFrames;
        }
    }
}
