package com.robinhood.android.equities.ladderftux;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.layout.ContentScale;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.shared.tradeladder.C40888R;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.BaseLadderEducationState;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.FtuxContextualBarData;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.TerminalLadderTransitionState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderFtuxProgressState.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState;", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "LadderEducation", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation;", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EquityTradeLadderFtuxProgressState extends GenericLadderFtuxProgressState {

    /* compiled from: EquityTradeLadderFtuxProgressState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void prefetchLottie(EquityTradeLadderFtuxProgressState equityTradeLadderFtuxProgressState, Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            GenericLadderFtuxProgressState.DefaultImpls.prefetchLottie(equityTradeLadderFtuxProgressState, context, z);
        }
    }

    /* compiled from: EquityTradeLadderFtuxProgressState.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u000b\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f BC\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u000b!\"#$%&'()*+¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation;", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/BaseLadderEducationState;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState;", "description", "", "descriptionSubText", "primaryButtonType", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/FtuxContextualBarData$ButtonType;", "secondaryButtonType", "showAppBarTitle", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/FtuxContextualBarData$ButtonType;Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/FtuxContextualBarData$ButtonType;Z)V", "getDescription", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescriptionSubText", "getPrimaryButtonType", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/FtuxContextualBarData$ButtonType;", "getSecondaryButtonType", "getShowAppBarTitle", "()Z", "LadderIntroduction", "LastTradePriceInformation", "CustomIncrementsInformation", "BidSpreadInformation", "AskSpreadInformation", "MarketOrderInformation", "LimitOrderInformation", "LimitOrderEditInformation", "LimitOrderCancelInformation", "AveragePriceInformation", "TransitionToLadderUi", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$AskSpreadInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$AveragePriceInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$BidSpreadInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$CustomIncrementsInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$LadderIntroduction;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$LastTradePriceInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$LimitOrderCancelInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$LimitOrderEditInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$LimitOrderInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$MarketOrderInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$TransitionToLadderUi;", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class LadderEducation extends BaseLadderEducationState implements EquityTradeLadderFtuxProgressState {
        public static final int $stable;
        private final Integer description;
        private final Integer descriptionSubText;
        private final FtuxContextualBarData.ButtonType primaryButtonType;
        private final FtuxContextualBarData.ButtonType secondaryButtonType;
        private final boolean showAppBarTitle;

        static {
            int i = BaseLadderEducationState.$stable;
            int i2 = FtuxContextualBarData.ButtonType.$stable;
            $stable = i | i2 | i2;
        }

        public /* synthetic */ LadderEducation(Integer num, Integer num2, FtuxContextualBarData.ButtonType buttonType, FtuxContextualBarData.ButtonType buttonType2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, num2, buttonType, buttonType2, z);
        }

        public /* synthetic */ LadderEducation(Integer num, Integer num2, FtuxContextualBarData.ButtonType buttonType, FtuxContextualBarData.ButtonType buttonType2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : buttonType, (i & 8) != 0 ? null : buttonType2, (i & 16) != 0 ? true : z, null);
        }

        public final Integer getDescription() {
            return this.description;
        }

        public final Integer getDescriptionSubText() {
            return this.descriptionSubText;
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
            super(num, num2, buttonType, buttonType2, z);
            this.description = num;
            this.descriptionSubText = num2;
            this.primaryButtonType = buttonType;
            this.secondaryButtonType = buttonType2;
            this.showAppBarTitle = z;
        }

        /* compiled from: EquityTradeLadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\tH\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$LadderIntroduction;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "nextState", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "title", "", "prevState", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LadderIntroduction extends LadderEducation {
            public static final int $stable;
            public static final Parcelable.Creator<LadderIntroduction> CREATOR;
            public static final LadderIntroduction INSTANCE = new LadderIntroduction();

            /* compiled from: EquityTradeLadderFtuxProgressState.kt */
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

            static {
                int i = BaseLadderEducationState.$stable;
                int i2 = FtuxContextualBarData.ButtonType.$stable;
                $stable = i | i2 | i2;
                CREATOR = new Creator();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LadderIntroduction);
            }

            public int hashCode() {
                return 1154116828;
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState prevState() {
                return null;
            }

            public String toString() {
                return "LadderIntroduction";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private LadderIntroduction() {
                super(Integer.valueOf(C14726R.string.equities_ladder_page_1_description), null, new FtuxContextualBarData.ButtonType.TextButton(StringResource.INSTANCE.invoke(C14726R.string.equities_ladder_page_1_primary_button, new Object[0])), null, false, 2, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState.LottieAnimationSpec getLottieAnimationSpec() {
                return new GenericLadderFtuxProgressState.LottieAnimationSpec(LottieUrl.EQUITIES_LADDER_FTUX_1_DAY, LottieUrl.EQUITIES_LADDER_FTUX_1_NIGHT, ContentScale.INSTANCE.getFillWidth(), 0, null, 24, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState nextState(String title) {
                return LastTradePriceInformation.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$LastTradePriceInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "nextState", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "title", "", "prevState", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LastTradePriceInformation extends LadderEducation {
            public static final int $stable;
            public static final Parcelable.Creator<LastTradePriceInformation> CREATOR;
            public static final LastTradePriceInformation INSTANCE = new LastTradePriceInformation();

            /* compiled from: EquityTradeLadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<LastTradePriceInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LastTradePriceInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LastTradePriceInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LastTradePriceInformation[] newArray(int i) {
                    return new LastTradePriceInformation[i];
                }
            }

            static {
                int i = BaseLadderEducationState.$stable;
                int i2 = FtuxContextualBarData.ButtonType.$stable;
                $stable = i | i2 | i2;
                CREATOR = new Creator();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LastTradePriceInformation);
            }

            public int hashCode() {
                return -1038407375;
            }

            public String toString() {
                return "LastTradePriceInformation";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private LastTradePriceInformation() {
                super(Integer.valueOf(C14726R.string.equities_ladder_page_2_description), Integer.valueOf(C14726R.string.equities_ladder_page_2_sub_description), EquityTradeLadderFtuxProgressState2.getDefaultPrimaryButton(), EquityTradeLadderFtuxProgressState2.getDefaultSecondaryButton(), false, 16, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState.LottieAnimationSpec getLottieAnimationSpec() {
                return new GenericLadderFtuxProgressState.LottieAnimationSpec(LottieUrl.EQUITIES_LADDER_FTUX_2_DAY, LottieUrl.EQUITIES_LADDER_FTUX_2_NIGHT, null, 0, null, 28, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState nextState(String title) {
                return CustomIncrementsInformation.INSTANCE;
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState prevState() {
                return LadderIntroduction.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$CustomIncrementsInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "nextState", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "title", "", "prevState", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CustomIncrementsInformation extends LadderEducation {
            public static final int $stable;
            public static final Parcelable.Creator<CustomIncrementsInformation> CREATOR;
            public static final CustomIncrementsInformation INSTANCE = new CustomIncrementsInformation();

            /* compiled from: EquityTradeLadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<CustomIncrementsInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CustomIncrementsInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CustomIncrementsInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CustomIncrementsInformation[] newArray(int i) {
                    return new CustomIncrementsInformation[i];
                }
            }

            static {
                int i = BaseLadderEducationState.$stable;
                int i2 = FtuxContextualBarData.ButtonType.$stable;
                $stable = i | i2 | i2;
                CREATOR = new Creator();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CustomIncrementsInformation);
            }

            public int hashCode() {
                return 598022455;
            }

            public String toString() {
                return "CustomIncrementsInformation";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private CustomIncrementsInformation() {
                super(Integer.valueOf(C14726R.string.equities_ladder_page_3_description), null, EquityTradeLadderFtuxProgressState2.getDefaultPrimaryButton(), EquityTradeLadderFtuxProgressState2.getDefaultSecondaryButton(), false, 18, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState.LottieAnimationSpec getLottieAnimationSpec() {
                return new GenericLadderFtuxProgressState.LottieAnimationSpec(LottieUrl.EQUITIES_LADDER_FTUX_3_DAY, LottieUrl.EQUITIES_LADDER_FTUX_3_NIGHT, null, 0, null, 28, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState nextState(String title) {
                return BidSpreadInformation.INSTANCE;
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState prevState() {
                return LastTradePriceInformation.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$BidSpreadInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "nextState", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "title", "", "prevState", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BidSpreadInformation extends LadderEducation {
            public static final int $stable;
            public static final Parcelable.Creator<BidSpreadInformation> CREATOR;
            public static final BidSpreadInformation INSTANCE = new BidSpreadInformation();

            /* compiled from: EquityTradeLadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<BidSpreadInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BidSpreadInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BidSpreadInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BidSpreadInformation[] newArray(int i) {
                    return new BidSpreadInformation[i];
                }
            }

            static {
                int i = BaseLadderEducationState.$stable;
                int i2 = FtuxContextualBarData.ButtonType.$stable;
                $stable = i | i2 | i2;
                CREATOR = new Creator();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof BidSpreadInformation);
            }

            public int hashCode() {
                return 148197820;
            }

            public String toString() {
                return "BidSpreadInformation";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private BidSpreadInformation() {
                super(Integer.valueOf(C14726R.string.equities_ladder_page_4_description), null, EquityTradeLadderFtuxProgressState2.getDefaultPrimaryButton(), EquityTradeLadderFtuxProgressState2.getDefaultSecondaryButton(), false, 18, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState.LottieAnimationSpec getLottieAnimationSpec() {
                return new GenericLadderFtuxProgressState.LottieAnimationSpec(LottieUrl.EQUITIES_LADDER_FTUX_4_DAY, LottieUrl.EQUITIES_LADDER_FTUX_4_NIGHT, null, 0, null, 28, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState nextState(String title) {
                return AskSpreadInformation.INSTANCE;
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState prevState() {
                return CustomIncrementsInformation.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$AskSpreadInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "nextState", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "title", "", "prevState", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AskSpreadInformation extends LadderEducation {
            public static final int $stable;
            public static final Parcelable.Creator<AskSpreadInformation> CREATOR;
            public static final AskSpreadInformation INSTANCE = new AskSpreadInformation();

            /* compiled from: EquityTradeLadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<AskSpreadInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AskSpreadInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AskSpreadInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AskSpreadInformation[] newArray(int i) {
                    return new AskSpreadInformation[i];
                }
            }

            static {
                int i = BaseLadderEducationState.$stable;
                int i2 = FtuxContextualBarData.ButtonType.$stable;
                $stable = i | i2 | i2;
                CREATOR = new Creator();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AskSpreadInformation);
            }

            public int hashCode() {
                return -1982301248;
            }

            public String toString() {
                return "AskSpreadInformation";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private AskSpreadInformation() {
                Integer num = null;
                boolean z = false;
                super(Integer.valueOf(C14726R.string.equities_ladder_page_5_description), num, new FtuxContextualBarData.ButtonType.IconButton(ServerToBentoAssetMapper2.ARROW_RIGHT_24, C40888R.string.ladder_ftux_continue_content_description, null, 4, null), new FtuxContextualBarData.ButtonType.IconButton(ServerToBentoAssetMapper2.ARROW_LEFT_24, C40888R.string.ladder_ftux_back_content_description, BentoIconButton4.Type.Secondary), z, 18, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState.LottieAnimationSpec getLottieAnimationSpec() {
                return new GenericLadderFtuxProgressState.LottieAnimationSpec(LottieUrl.EQUITIES_LADDER_FTUX_5_DAY, LottieUrl.EQUITIES_LADDER_FTUX_5_NIGHT, null, 0, null, 28, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState nextState(String title) {
                return MarketOrderInformation.INSTANCE;
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState prevState() {
                return BidSpreadInformation.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$MarketOrderInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "nextState", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "title", "", "prevState", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MarketOrderInformation extends LadderEducation {
            public static final int $stable;
            public static final Parcelable.Creator<MarketOrderInformation> CREATOR;
            public static final MarketOrderInformation INSTANCE = new MarketOrderInformation();

            /* compiled from: EquityTradeLadderFtuxProgressState.kt */
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

            static {
                int i = BaseLadderEducationState.$stable;
                int i2 = FtuxContextualBarData.ButtonType.$stable;
                $stable = i | i2 | i2;
                CREATOR = new Creator();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof MarketOrderInformation);
            }

            public int hashCode() {
                return -116762406;
            }

            public String toString() {
                return "MarketOrderInformation";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private MarketOrderInformation() {
                super(Integer.valueOf(C14726R.string.equities_ladder_page_6_description), null, EquityTradeLadderFtuxProgressState2.getDefaultPrimaryButton(), EquityTradeLadderFtuxProgressState2.getDefaultSecondaryButton(), false, 18, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState.LottieAnimationSpec getLottieAnimationSpec() {
                return new GenericLadderFtuxProgressState.LottieAnimationSpec(LottieUrl.EQUITIES_LADDER_FTUX_6_DAY, LottieUrl.EQUITIES_LADDER_FTUX_6_NIGHT, null, 0, null, 28, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState nextState(String title) {
                return LimitOrderInformation.INSTANCE;
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState prevState() {
                return AskSpreadInformation.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$LimitOrderInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "nextState", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "title", "", "prevState", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LimitOrderInformation extends LadderEducation {
            public static final int $stable;
            public static final Parcelable.Creator<LimitOrderInformation> CREATOR;
            public static final LimitOrderInformation INSTANCE = new LimitOrderInformation();

            /* compiled from: EquityTradeLadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<LimitOrderInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LimitOrderInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LimitOrderInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LimitOrderInformation[] newArray(int i) {
                    return new LimitOrderInformation[i];
                }
            }

            static {
                int i = BaseLadderEducationState.$stable;
                int i2 = FtuxContextualBarData.ButtonType.$stable;
                $stable = i | i2 | i2;
                CREATOR = new Creator();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LimitOrderInformation);
            }

            public int hashCode() {
                return 1172603737;
            }

            public String toString() {
                return "LimitOrderInformation";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private LimitOrderInformation() {
                super(Integer.valueOf(C14726R.string.equities_ladder_page_7_description), null, EquityTradeLadderFtuxProgressState2.getDefaultPrimaryButton(), EquityTradeLadderFtuxProgressState2.getDefaultSecondaryButton(), false, 18, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState.LottieAnimationSpec getLottieAnimationSpec() {
                return new GenericLadderFtuxProgressState.LottieAnimationSpec(LottieUrl.EQUITIES_LADDER_FTUX_7_DAY, LottieUrl.EQUITIES_LADDER_FTUX_7_NIGHT, null, 0, null, 28, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState nextState(String title) {
                return LimitOrderEditInformation.INSTANCE;
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState prevState() {
                return MarketOrderInformation.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$LimitOrderEditInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "nextState", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "title", "", "prevState", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LimitOrderEditInformation extends LadderEducation {
            public static final int $stable;
            public static final Parcelable.Creator<LimitOrderEditInformation> CREATOR;
            public static final LimitOrderEditInformation INSTANCE = new LimitOrderEditInformation();

            /* compiled from: EquityTradeLadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<LimitOrderEditInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LimitOrderEditInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LimitOrderEditInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LimitOrderEditInformation[] newArray(int i) {
                    return new LimitOrderEditInformation[i];
                }
            }

            static {
                int i = BaseLadderEducationState.$stable;
                int i2 = FtuxContextualBarData.ButtonType.$stable;
                $stable = i | i2 | i2;
                CREATOR = new Creator();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LimitOrderEditInformation);
            }

            public int hashCode() {
                return 2021758063;
            }

            public String toString() {
                return "LimitOrderEditInformation";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private LimitOrderEditInformation() {
                super(Integer.valueOf(C14726R.string.equities_ladder_page_8_description), null, EquityTradeLadderFtuxProgressState2.getDefaultPrimaryButton(), EquityTradeLadderFtuxProgressState2.getDefaultSecondaryButton(), false, 18, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState.LottieAnimationSpec getLottieAnimationSpec() {
                return new GenericLadderFtuxProgressState.LottieAnimationSpec(LottieUrl.EQUITIES_LADDER_FTUX_8_DAY, LottieUrl.EQUITIES_LADDER_FTUX_8_NIGHT, null, Integer.MAX_VALUE, null, 20, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState nextState(String title) {
                return LimitOrderCancelInformation.INSTANCE;
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState prevState() {
                return LimitOrderInformation.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$LimitOrderCancelInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "nextState", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "title", "", "prevState", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LimitOrderCancelInformation extends LadderEducation {
            public static final int $stable;
            public static final Parcelable.Creator<LimitOrderCancelInformation> CREATOR;
            public static final LimitOrderCancelInformation INSTANCE = new LimitOrderCancelInformation();

            /* compiled from: EquityTradeLadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<LimitOrderCancelInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LimitOrderCancelInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LimitOrderCancelInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LimitOrderCancelInformation[] newArray(int i) {
                    return new LimitOrderCancelInformation[i];
                }
            }

            static {
                int i = BaseLadderEducationState.$stable;
                int i2 = FtuxContextualBarData.ButtonType.$stable;
                $stable = i | i2 | i2;
                CREATOR = new Creator();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LimitOrderCancelInformation);
            }

            public int hashCode() {
                return 1646917311;
            }

            public String toString() {
                return "LimitOrderCancelInformation";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private LimitOrderCancelInformation() {
                super(Integer.valueOf(C14726R.string.equities_ladder_page_9_description), null, EquityTradeLadderFtuxProgressState2.getDefaultPrimaryButton(), EquityTradeLadderFtuxProgressState2.getDefaultSecondaryButton(), false, 18, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState.LottieAnimationSpec getLottieAnimationSpec() {
                return new GenericLadderFtuxProgressState.LottieAnimationSpec(LottieUrl.EQUITIES_LADDER_FTUX_9_DAY, LottieUrl.EQUITIES_LADDER_FTUX_9_NIGHT, null, Integer.MAX_VALUE, null, 20, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState nextState(String title) {
                return AveragePriceInformation.INSTANCE;
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState prevState() {
                return LimitOrderEditInformation.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$AveragePriceInformation;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "nextState", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "title", "", "prevState", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AveragePriceInformation extends LadderEducation {
            public static final int $stable;
            public static final Parcelable.Creator<AveragePriceInformation> CREATOR;
            public static final AveragePriceInformation INSTANCE = new AveragePriceInformation();

            /* compiled from: EquityTradeLadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<AveragePriceInformation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AveragePriceInformation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AveragePriceInformation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AveragePriceInformation[] newArray(int i) {
                    return new AveragePriceInformation[i];
                }
            }

            static {
                int i = BaseLadderEducationState.$stable;
                int i2 = FtuxContextualBarData.ButtonType.$stable;
                $stable = i | i2 | i2;
                CREATOR = new Creator();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AveragePriceInformation);
            }

            public int hashCode() {
                return 1242713312;
            }

            public String toString() {
                return "AveragePriceInformation";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private AveragePriceInformation() {
                super(Integer.valueOf(C14726R.string.equities_ladder_page_10_description), null, EquityTradeLadderFtuxProgressState2.getDefaultPrimaryButton(), EquityTradeLadderFtuxProgressState2.getDefaultSecondaryButton(), false, 18, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState.LottieAnimationSpec getLottieAnimationSpec() {
                return new GenericLadderFtuxProgressState.LottieAnimationSpec(LottieUrl.EQUITIES_LADDER_FTUX_10_DAY, LottieUrl.EQUITIES_LADDER_FTUX_10_NIGHT, null, Integer.MAX_VALUE, null, 20, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState nextState(String title) {
                return new TransitionToLadderUi(title);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState prevState() {
                return LimitOrderCancelInformation.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderFtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation$TransitionToLadderUi;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState$LadderEducation;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "lottieAnimationSpec", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "nextState", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "prevState", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TransitionToLadderUi extends LadderEducation {
            public static final int $stable;
            public static final Parcelable.Creator<TransitionToLadderUi> CREATOR;
            private final String title;

            /* compiled from: EquityTradeLadderFtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<TransitionToLadderUi> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TransitionToLadderUi createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TransitionToLadderUi(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TransitionToLadderUi[] newArray(int i) {
                    return new TransitionToLadderUi[i];
                }
            }

            static {
                int i = BaseLadderEducationState.$stable;
                int i2 = FtuxContextualBarData.ButtonType.$stable;
                $stable = i | i2 | i2;
                CREATOR = new Creator();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public TransitionToLadderUi() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ TransitionToLadderUi copy$default(TransitionToLadderUi transitionToLadderUi, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = transitionToLadderUi.title;
                }
                return transitionToLadderUi.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final TransitionToLadderUi copy(String title) {
                return new TransitionToLadderUi(title);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TransitionToLadderUi) && Intrinsics.areEqual(this.title, ((TransitionToLadderUi) other).title);
            }

            public int hashCode() {
                String str = this.title;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState prevState() {
                return null;
            }

            public String toString() {
                return "TransitionToLadderUi(title=" + this.title + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
            }

            public /* synthetic */ TransitionToLadderUi(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final String getTitle() {
                return this.title;
            }

            public TransitionToLadderUi(String str) {
                super(Integer.valueOf(C14726R.string.equities_ladder_page_11_description), null, new FtuxContextualBarData.ButtonType.TextButton(StringResource.INSTANCE.invoke(C14726R.string.equities_ladder_page_11_primary_button, str)), null, false, 18, null);
                this.title = str;
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState.LottieAnimationSpec getLottieAnimationSpec() {
                return new GenericLadderFtuxProgressState.LottieAnimationSpec(LottieUrl.EQUITIES_LADDER_FTUX_11_DAY, LottieUrl.EQUITIES_LADDER_FTUX_11_NIGHT, null, 0, null, 28, null);
            }

            @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
            public GenericLadderFtuxProgressState nextState(String title) {
                return new TerminalLadderTransitionState();
            }
        }
    }
}
