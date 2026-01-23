package com.robinhood.android.common.recurring.trade.explanation;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.recurring.trade.explanation.AmountLabelExplanationUiModel;
import com.robinhood.android.common.util.extensions.LearnMoresKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Collections3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AmountLabelExplanationUiModel.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X \u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanationUiModel;", "", "<init>", "()V", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "getAmount$feature_lib_recurring_externalDebug", "()Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "BottomSheet", "Dialog", "Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanationUiModel$BottomSheet;", "Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanationUiModel$Dialog;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class AmountLabelExplanationUiModel {
    public static final int $stable = 0;

    public /* synthetic */ AmountLabelExplanationUiModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract InvestmentScheduleAmount getAmount$feature_lib_recurring_externalDebug();

    private AmountLabelExplanationUiModel() {
    }

    /* compiled from: AmountLabelExplanationUiModel.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011J\u000e\u0010\u0014\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003J#\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0012J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0012HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanationUiModel$BottomSheet;", "Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanationUiModel;", "Landroid/os/Parcelable;", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "explanations", "", "Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanation;", "<init>", "(Lcom/robinhood/recurring/models/InvestmentScheduleAmount;Ljava/util/List;)V", "getAmount$feature_lib_recurring_externalDebug", "()Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "getText", "", "resources", "Landroid/content/res/Resources;", "learnMore", "Lkotlin/Function1;", "", "", "component1", "component1$feature_lib_recurring_externalDebug", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class BottomSheet extends AmountLabelExplanationUiModel implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<BottomSheet> CREATOR = new Creator();
        private final InvestmentScheduleAmount amount;
        private final List<AmountLabelExplanation> explanations;

        /* compiled from: AmountLabelExplanationUiModel.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<BottomSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BottomSheet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                InvestmentScheduleAmount investmentScheduleAmount = (InvestmentScheduleAmount) parcel.readParcelable(BottomSheet.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AmountLabelExplanation.valueOf(parcel.readString()));
                }
                return new BottomSheet(investmentScheduleAmount, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BottomSheet[] newArray(int i) {
                return new BottomSheet[i];
            }
        }

        private final List<AmountLabelExplanation> component2() {
            return this.explanations;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BottomSheet copy$default(BottomSheet bottomSheet, InvestmentScheduleAmount investmentScheduleAmount, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                investmentScheduleAmount = bottomSheet.amount;
            }
            if ((i & 2) != 0) {
                list = bottomSheet.explanations;
            }
            return bottomSheet.copy(investmentScheduleAmount, list);
        }

        /* renamed from: component1$feature_lib_recurring_externalDebug, reason: from getter */
        public final InvestmentScheduleAmount getAmount() {
            return this.amount;
        }

        public final BottomSheet copy(InvestmentScheduleAmount amount, List<? extends AmountLabelExplanation> explanations) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(explanations, "explanations");
            return new BottomSheet(amount, explanations);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BottomSheet)) {
                return false;
            }
            BottomSheet bottomSheet = (BottomSheet) other;
            return Intrinsics.areEqual(this.amount, bottomSheet.amount) && Intrinsics.areEqual(this.explanations, bottomSheet.explanations);
        }

        public int hashCode() {
            return (this.amount.hashCode() * 31) + this.explanations.hashCode();
        }

        public String toString() {
            return "BottomSheet(amount=" + this.amount + ", explanations=" + this.explanations + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            List<AmountLabelExplanation> list = this.explanations;
            dest.writeInt(list.size());
            Iterator<AmountLabelExplanation> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
        }

        @Override // com.robinhood.android.common.recurring.trade.explanation.AmountLabelExplanationUiModel
        public InvestmentScheduleAmount getAmount$feature_lib_recurring_externalDebug() {
            return this.amount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public BottomSheet(InvestmentScheduleAmount amount, List<? extends AmountLabelExplanation> explanations) {
            super(null);
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(explanations, "explanations");
            this.amount = amount;
            this.explanations = explanations;
            if (explanations.size() <= 1) {
                throw new IllegalStateException("BottomSheet must be used to show multiple disclaimers!");
            }
        }

        public final CharSequence getText(final Resources resources, final Function1<? super Integer, Unit> learnMore) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(learnMore, "learnMore");
            return (CharSequence) _Collections3.joinTo(this.explanations, new SpannableStringBuilder(), (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 2) != 0 ? ", " : "\n\n", (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 4) != 0 ? "" : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 8) == 0 ? null : "", (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 16) != 0 ? -1 : 0, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 32) != 0 ? "..." : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 64) != 0 ? null : new Function1() { // from class: com.robinhood.android.common.recurring.trade.explanation.AmountLabelExplanationUiModel$BottomSheet$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AmountLabelExplanationUiModel.BottomSheet.getText$lambda$4(resources, this, learnMore, (AmountLabelExplanation) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence getText$lambda$4(Resources resources, BottomSheet bottomSheet, final Function1 function1, AmountLabelExplanation amountLabelExplanation) {
            Intrinsics.checkNotNullParameter(amountLabelExplanation, "amountLabelExplanation");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StyleSpan styleSpan = new StyleSpan(1);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) resources.getString(amountLabelExplanation.getTitle()));
            spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) "\n");
            final Integer learnMoreUrl = amountLabelExplanation.getLearnMoreUrl();
            if (learnMoreUrl != null) {
                spannableStringBuilder.append(LearnMoresKt.buildTextWithLearnMore$default(resources, amountLabelExplanation.getStringResource(bottomSheet.getAmount$feature_lib_recurring_externalDebug()).getText(resources), true, null, true, null, new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.common.recurring.trade.explanation.AmountLabelExplanationUiModel$BottomSheet$getText$lambda$4$lambda$3$$inlined$buildTextWithLearnMore$default$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function1.invoke(learnMoreUrl);
                    }
                }, 1, (DefaultConstructorMarker) null), 4, null));
            } else {
                spannableStringBuilder.append(amountLabelExplanation.getStringResource(bottomSheet.getAmount$feature_lib_recurring_externalDebug()).getText(resources));
            }
            return new SpannedString(spannableStringBuilder);
        }
    }

    /* compiled from: AmountLabelExplanationUiModel.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001fJ\t\u0010 \u001a\u00020\u0005HÂ\u0003J\u001d\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u000bHÖ\u0001J\t\u0010'\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanationUiModel$Dialog;", "Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanationUiModel;", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "explanation", "Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanation;", "<init>", "(Lcom/robinhood/recurring/models/InvestmentScheduleAmount;Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanation;)V", "getAmount$feature_lib_recurring_externalDebug", "()Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "id", "", "getId", "()I", "title", "getTitle", "theme", "getTheme", "tag", "", "getTag", "()Ljava/lang/String;", "learnMore", "getLearnMore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getText", "", "resources", "Landroid/content/res/Resources;", "component1", "component1$feature_lib_recurring_externalDebug", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Dialog extends AmountLabelExplanationUiModel {
        public static final int $stable = 8;
        private final InvestmentScheduleAmount amount;
        private final AmountLabelExplanation explanation;
        private final int id;
        private final Integer learnMore;
        private final String tag;
        private final int theme;
        private final int title;

        /* renamed from: component2, reason: from getter */
        private final AmountLabelExplanation getExplanation() {
            return this.explanation;
        }

        public static /* synthetic */ Dialog copy$default(Dialog dialog, InvestmentScheduleAmount investmentScheduleAmount, AmountLabelExplanation amountLabelExplanation, int i, Object obj) {
            if ((i & 1) != 0) {
                investmentScheduleAmount = dialog.amount;
            }
            if ((i & 2) != 0) {
                amountLabelExplanation = dialog.explanation;
            }
            return dialog.copy(investmentScheduleAmount, amountLabelExplanation);
        }

        /* renamed from: component1$feature_lib_recurring_externalDebug, reason: from getter */
        public final InvestmentScheduleAmount getAmount() {
            return this.amount;
        }

        public final Dialog copy(InvestmentScheduleAmount amount, AmountLabelExplanation explanation) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(explanation, "explanation");
            return new Dialog(amount, explanation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) other;
            return Intrinsics.areEqual(this.amount, dialog.amount) && this.explanation == dialog.explanation;
        }

        public int hashCode() {
            return (this.amount.hashCode() * 31) + this.explanation.hashCode();
        }

        public String toString() {
            return "Dialog(amount=" + this.amount + ", explanation=" + this.explanation + ")";
        }

        @Override // com.robinhood.android.common.recurring.trade.explanation.AmountLabelExplanationUiModel
        public InvestmentScheduleAmount getAmount$feature_lib_recurring_externalDebug() {
            return this.amount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(InvestmentScheduleAmount amount, AmountLabelExplanation explanation) {
            super(null);
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(explanation, "explanation");
            this.amount = amount;
            this.explanation = explanation;
            this.id = explanation.getId();
            this.title = explanation.getTitle();
            this.theme = explanation.getTheme();
            this.tag = explanation.getTag();
            this.learnMore = explanation.getLearnMoreUrl();
        }

        public final int getId() {
            return this.id;
        }

        public final int getTitle() {
            return this.title;
        }

        public final int getTheme() {
            return this.theme;
        }

        public final String getTag() {
            return this.tag;
        }

        public final Integer getLearnMore() {
            return this.learnMore;
        }

        public final CharSequence getText(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            return this.explanation.getStringResource(getAmount$feature_lib_recurring_externalDebug()).getText(resources);
        }
    }
}
