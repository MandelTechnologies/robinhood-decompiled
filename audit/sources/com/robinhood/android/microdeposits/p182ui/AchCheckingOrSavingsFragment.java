package com.robinhood.android.microdeposits.p182ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.QuestionFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.microdeposits.C21805R;
import com.robinhood.android.microdeposits.p182ui.AchCheckingOrSavingsFragment;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AchCheckingOrSavingsFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchCheckingOrSavingsFragment;", "Lcom/robinhood/android/common/ui/QuestionFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/microdeposits/ui/AchCheckingOrSavingsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/microdeposits/ui/AchCheckingOrSavingsFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "onAnswerClicked", "answerIndex", "", "Callbacks", "Companion", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class AchCheckingOrSavingsFragment extends QuestionFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AchCheckingOrSavingsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/microdeposits/ui/AchCheckingOrSavingsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AchCheckingOrSavingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchCheckingOrSavingsFragment$Callbacks;", "", "onBankAccountTypeSelected", "", "bankAccountType", "Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBankAccountTypeSelected(ApiAchRelationship.BankAccountType bankAccountType);
    }

    @JvmStatic
    public static final AchCheckingOrSavingsFragment newInstance() {
        return INSTANCE.newInstance();
    }

    public AchCheckingOrSavingsFragment() {
        super(C21805R.layout.fragment_ach_checking_or_savings);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.microdeposits.ui.AchCheckingOrSavingsFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AchCheckingOrSavingsFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setLayouts(C11048R.layout.include_list_header, null, C11048R.layout.row_question);
        String string2 = getString(C21805R.string.ach_create_checking_or_savings_prompt);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String[] stringArray = getResources().getStringArray(C21805R.array.ach_relationship_labels);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        setQuestion(string2, (CharSequence) null, new ArrayAdapter(requireContext(), C11048R.layout.row_question, stringArray));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C21805R.string.ach_create_checking_or_savings_title);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.microdeposits.ui.CreateAchRelationshipActivity");
        return ((CreateAchRelationshipActivity) fragmentActivityRequireActivity).getIavSource$feature_microdeposits_externalDebug().getAnalyticsTag();
    }

    @Override // com.robinhood.android.common.p088ui.QuestionFragment
    public void onAnswerClicked(int answerIndex) {
        ApiAchRelationship.BankAccountType bankAccountType;
        if (answerIndex == 0) {
            bankAccountType = ApiAchRelationship.BankAccountType.CHECKING;
        } else if (answerIndex == 1) {
            bankAccountType = ApiAchRelationship.BankAccountType.SAVINGS;
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(answerIndex));
            throw new ExceptionsH();
        }
        getCallbacks().onBankAccountTypeSelected(bankAccountType);
    }

    /* compiled from: AchCheckingOrSavingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchCheckingOrSavingsFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/microdeposits/ui/AchCheckingOrSavingsFragment;", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AchCheckingOrSavingsFragment newInstance() {
            return new AchCheckingOrSavingsFragment();
        }
    }
}
