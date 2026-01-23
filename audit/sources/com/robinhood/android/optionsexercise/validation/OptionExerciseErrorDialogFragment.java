package com.robinhood.android.optionsexercise.validation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: OptionExerciseErrorDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0002<=B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\t\u00105\u001a\u000206H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001b\u0010\u000e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR\u001b\u0010\u0011\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0012\u0010\bR\u001b\u0010\u0014\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0015\u0010\bR\u001b\u0010\u0017\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0018\u0010\bR\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001dR\u001b\u0010#\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010\u001dR\u001b\u0010&\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b'\u0010\u001dR\u001b\u0010)\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b*\u0010\u001dR\u001b\u0010,\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b-\u0010\u001dR\u0018\u00107\u001a\b\u0012\u0004\u0012\u00020908X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/OptionExerciseErrorDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "firstRowLabelTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getFirstRowLabelTxt", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "firstRowLabelTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "firstRowValueTxt", "getFirstRowValueTxt", "firstRowValueTxt$delegate", "secondRowLabelTxt", "getSecondRowLabelTxt", "secondRowLabelTxt$delegate", "secondRowValueTxt", "getSecondRowValueTxt", "secondRowValueTxt$delegate", "thirdRowLabelTxt", "getThirdRowLabelTxt", "thirdRowLabelTxt$delegate", "thirdRowValueTxt", "getThirdRowValueTxt", "thirdRowValueTxt$delegate", "firstRowLabel", "", "getFirstRowLabel", "()Ljava/lang/String;", "firstRowLabel$delegate", "Lkotlin/Lazy;", "firstRowValue", "getFirstRowValue", "firstRowValue$delegate", "secondRowLabel", "getSecondRowLabel", "secondRowLabel$delegate", "secondRowValue", "getSecondRowValue", "secondRowValue$delegate", "thirdRowLabel", "getThirdRowLabel", "thirdRowLabel$delegate", "thirdRowValue", "getThirdRowValue", "thirdRowValue$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Builder", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionExerciseErrorDialogFragment extends RhDialogFragment implements RegionGated {
    private static final String EXTRA_ERROR_LABEL_ROW_1 = "extraErrorLabelRow1";
    private static final String EXTRA_ERROR_LABEL_ROW_2 = "extraErrorLabelRow2";
    private static final String EXTRA_ERROR_LABEL_ROW_3 = "extraErrorLabelRow3";
    private static final String EXTRA_ERROR_VALUE_ROW_1 = "extraErrorValueRow1";
    private static final String EXTRA_ERROR_VALUE_ROW_2 = "extraErrorValueRow2";
    private static final String EXTRA_ERROR_VALUE_ROW_3 = "extraErrorValueRow3";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionExerciseErrorDialogFragment.class, "firstRowLabelTxt", "getFirstRowLabelTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseErrorDialogFragment.class, "firstRowValueTxt", "getFirstRowValueTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseErrorDialogFragment.class, "secondRowLabelTxt", "getSecondRowLabelTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseErrorDialogFragment.class, "secondRowValueTxt", "getSecondRowValueTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseErrorDialogFragment.class, "thirdRowLabelTxt", "getThirdRowLabelTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseErrorDialogFragment.class, "thirdRowValueTxt", "getThirdRowValueTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: firstRowLabelTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 firstRowLabelTxt = bindView(C24704R.id.option_exercise_row_1_label);

    /* renamed from: firstRowValueTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 firstRowValueTxt = bindView(C24704R.id.option_exercise_row_1_value);

    /* renamed from: secondRowLabelTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 secondRowLabelTxt = bindView(C24704R.id.option_exercise_row_2_label);

    /* renamed from: secondRowValueTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 secondRowValueTxt = bindView(C24704R.id.option_exercise_row_2_value);

    /* renamed from: thirdRowLabelTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 thirdRowLabelTxt = bindView(C24704R.id.option_exercise_row_3_label);

    /* renamed from: thirdRowValueTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 thirdRowValueTxt = bindView(C24704R.id.option_exercise_row_3_value);

    /* renamed from: firstRowLabel$delegate, reason: from kotlin metadata */
    private final Lazy firstRowLabel = Fragments2.argument(this, EXTRA_ERROR_LABEL_ROW_1);

    /* renamed from: firstRowValue$delegate, reason: from kotlin metadata */
    private final Lazy firstRowValue = Fragments2.argument(this, EXTRA_ERROR_VALUE_ROW_1);

    /* renamed from: secondRowLabel$delegate, reason: from kotlin metadata */
    private final Lazy secondRowLabel = Fragments2.argument(this, EXTRA_ERROR_LABEL_ROW_2);

    /* renamed from: secondRowValue$delegate, reason: from kotlin metadata */
    private final Lazy secondRowValue = Fragments2.argument(this, EXTRA_ERROR_VALUE_ROW_2);

    /* renamed from: thirdRowLabel$delegate, reason: from kotlin metadata */
    private final Lazy thirdRowLabel = Fragments2.argument(this, EXTRA_ERROR_LABEL_ROW_3);

    /* renamed from: thirdRowValue$delegate, reason: from kotlin metadata */
    private final Lazy thirdRowValue = Fragments2.argument(this, EXTRA_ERROR_VALUE_ROW_3);

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    private final RhTextView getFirstRowLabelTxt() {
        return (RhTextView) this.firstRowLabelTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final RhTextView getFirstRowValueTxt() {
        return (RhTextView) this.firstRowValueTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final RhTextView getSecondRowLabelTxt() {
        return (RhTextView) this.secondRowLabelTxt.getValue(this, $$delegatedProperties[2]);
    }

    private final RhTextView getSecondRowValueTxt() {
        return (RhTextView) this.secondRowValueTxt.getValue(this, $$delegatedProperties[3]);
    }

    private final RhTextView getThirdRowLabelTxt() {
        return (RhTextView) this.thirdRowLabelTxt.getValue(this, $$delegatedProperties[4]);
    }

    private final RhTextView getThirdRowValueTxt() {
        return (RhTextView) this.thirdRowValueTxt.getValue(this, $$delegatedProperties[5]);
    }

    private final String getFirstRowLabel() {
        return (String) this.firstRowLabel.getValue();
    }

    private final String getFirstRowValue() {
        return (String) this.firstRowValue.getValue();
    }

    private final String getSecondRowLabel() {
        return (String) this.secondRowLabel.getValue();
    }

    private final String getSecondRowValue() {
        return (String) this.secondRowValue.getValue();
    }

    private final String getThirdRowLabel() {
        return (String) this.thirdRowLabel.getValue();
    }

    private final String getThirdRowValue() {
        return (String) this.thirdRowValue.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getFirstRowLabelTxt().setText(getFirstRowLabel());
        getFirstRowValueTxt().setText(getFirstRowValue());
        getSecondRowLabelTxt().setText(getSecondRowLabel());
        getSecondRowValueTxt().setText(getSecondRowValue());
        getThirdRowLabelTxt().setText(getThirdRowLabel());
        getThirdRowValueTxt().setText(getThirdRowValue());
    }

    /* compiled from: OptionExerciseErrorDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\f\u001a\u00020\rH\u0014¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/OptionExerciseErrorDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "setFirstRow", AnnotatedPrivateKey.LABEL, "", "value", "setSecondRow", "setThirdRow", "createDialogFragment", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Builder extends RhDialogFragment.Builder {
        public static final int $stable = RhDialogFragment.Builder.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public final Builder setFirstRow(String label, String value) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            getDialogArgs().putString(OptionExerciseErrorDialogFragment.EXTRA_ERROR_LABEL_ROW_1, label);
            getDialogArgs().putString(OptionExerciseErrorDialogFragment.EXTRA_ERROR_VALUE_ROW_1, value);
            return this;
        }

        public final Builder setSecondRow(String label, String value) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            getDialogArgs().putString(OptionExerciseErrorDialogFragment.EXTRA_ERROR_LABEL_ROW_2, label);
            getDialogArgs().putString(OptionExerciseErrorDialogFragment.EXTRA_ERROR_VALUE_ROW_2, value);
            return this;
        }

        public final Builder setThirdRow(String label, String value) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            getDialogArgs().putString(OptionExerciseErrorDialogFragment.EXTRA_ERROR_LABEL_ROW_3, label);
            getDialogArgs().putString(OptionExerciseErrorDialogFragment.EXTRA_ERROR_VALUE_ROW_3, value);
            return this;
        }

        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        protected RhDialogFragment createDialogFragment() {
            setLayoutRes(C24704R.layout.dialog_option_exercise_error);
            return new OptionExerciseErrorDialogFragment();
        }
    }

    /* compiled from: OptionExerciseErrorDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/OptionExerciseErrorDialogFragment$Companion;", "", "<init>", "()V", "EXTRA_ERROR_LABEL_ROW_1", "", "EXTRA_ERROR_VALUE_ROW_1", "EXTRA_ERROR_LABEL_ROW_2", "EXTRA_ERROR_VALUE_ROW_2", "EXTRA_ERROR_LABEL_ROW_3", "EXTRA_ERROR_VALUE_ROW_3", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseErrorDialogFragment$Builder;", "context", "Landroid/content/Context;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Builder create(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Builder(context);
        }
    }
}
