package com.robinhood.android.verification.email;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.verification.C31368R;
import com.robinhood.android.verification.databinding.FragmentEmailConfirmationBinding;
import com.robinhood.android.verification.email.BaseEmailVerificationFragment;
import com.robinhood.android.verification.email.EmailConfirmationFragment;
import com.robinhood.android.verification.email.EmailConfirmationViewState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EmailConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u0001:\u0003123B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u001aH\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0019H\u0016J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u001a2\u0006\u0010-\u001a\u000200H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001e¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailConfirmationFragment;", "Lcom/robinhood/android/verification/email/BaseEmailVerificationFragment;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "duxo", "Lcom/robinhood/android/verification/email/EmailConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/verification/email/EmailConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/verification/databinding/FragmentEmailConfirmationBinding;", "getBinding", "()Lcom/robinhood/android/verification/databinding/FragmentEmailConfirmationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "callbacks", "Lcom/robinhood/android/verification/email/EmailConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/verification/email/EmailConfirmationFragment$Callbacks;", "callbacks$delegate", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onBackPressed", "onLoading", "isLoading", "handleLinkSentOrErrorState", "state", "Lcom/robinhood/android/verification/email/EmailConfirmationViewState$LinkSentOrError;", "handleVerificationWorkflowState", "Lcom/robinhood/android/verification/email/EmailConfirmationViewState$VerificationWorkflow;", "Callbacks", "Args", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EmailConfirmationFragment extends BaseEmailVerificationFragment {
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EmailConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/android/verification/databinding/FragmentEmailConfirmationBinding;", 0)), Reflection.property1(new PropertyReference1Impl(EmailConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/verification/email/EmailConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EmailConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailConfirmationFragment$Callbacks;", "Lcom/robinhood/android/verification/email/BaseEmailVerificationFragment$BaseCallbacks;", "onEmailConfirmed", "", "email", "", "onEmailConfirmationLearnMoreClick", "onChangeEmailClicked", "verificationType", "Lcom/robinhood/android/verification/email/EmailVerificationType;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends BaseEmailVerificationFragment.BaseCallbacks {
        void onChangeEmailClicked(EmailVerificationType verificationType);

        void onEmailConfirmationLearnMoreClick();

        void onEmailConfirmed(String email);
    }

    /* compiled from: EmailConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailVerificationType.values().length];
            try {
                iArr[EmailVerificationType.VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmailVerificationType.REVERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EmailConfirmationFragment() {
        super(C31368R.layout.fragment_email_confirmation);
        this.duxo = OldDuxos.oldDuxo(this, EmailConfirmationDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, EmailConfirmationFragment2.INSTANCE);
        this.launchSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.android.verification.email.EmailConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, new Function0() { // from class: com.robinhood.android.verification.email.EmailConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailConfirmationFragment.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0) null, 4, (Object) null);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.verification.email.EmailConfirmationFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof EmailConfirmationFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    private final EmailConfirmationDuxo getDuxo() {
        return (EmailConfirmationDuxo) this.duxo.getValue();
    }

    private final FragmentEmailConfirmationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEmailConfirmationBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(EmailConfirmationFragment emailConfirmationFragment) {
        emailConfirmationFragment.getDuxo().sendLink(((Args) INSTANCE.getArgs((Fragment) emailConfirmationFragment)).getToBeConfirmedEmail());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.verification.email.BaseEmailVerificationFragment
    public Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton emailConfirmationPrimaryCta = getBinding().emailConfirmationPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(emailConfirmationPrimaryCta, "emailConfirmationPrimaryCta");
        OnClickListeners.onClick(emailConfirmationPrimaryCta, new Function0() { // from class: com.robinhood.android.verification.email.EmailConfirmationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailConfirmationFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getVerificationType().ordinal()];
        if (i == 1) {
            RdsButton emailConfirmationChangeEmailBtn = getBinding().emailConfirmationChangeEmailBtn;
            Intrinsics.checkNotNullExpressionValue(emailConfirmationChangeEmailBtn, "emailConfirmationChangeEmailBtn");
            OnClickListeners.onClick(emailConfirmationChangeEmailBtn, new Function0() { // from class: com.robinhood.android.verification.email.EmailConfirmationFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EmailConfirmationFragment.onViewCreated$lambda$4(this.f$0);
                }
            });
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            RdsButton emailConfirmationChangeEmailBtn2 = getBinding().emailConfirmationChangeEmailBtn;
            Intrinsics.checkNotNullExpressionValue(emailConfirmationChangeEmailBtn2, "emailConfirmationChangeEmailBtn");
            emailConfirmationChangeEmailBtn2.setVisibility(8);
        }
        getBinding().emailConfirmationEmailText.setText(((Args) companion.getArgs((Fragment) this)).getToBeConfirmedEmail());
        RhTextView emailConfirmationSubtitleText = getBinding().emailConfirmationSubtitleText;
        Intrinsics.checkNotNullExpressionValue(emailConfirmationSubtitleText, "emailConfirmationSubtitleText");
        int i2 = C31368R.string.email_confirmation_subtitle;
        final Callbacks callbacks = getCallbacks();
        String string2 = ViewsKt.getString(emailConfirmationSubtitleText, i2);
        num = num.intValue() == 0 ? null : 0;
        TextViewsKt.setTextWithLearnMore((TextView) emailConfirmationSubtitleText, (CharSequence) string2, false, true, num != null ? ViewsKt.getString(emailConfirmationSubtitleText, num.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.verification.email.EmailConfirmationFragment$onViewCreated$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                callbacks.onEmailConfirmationLearnMoreClick();
            }
        }, 1, (DefaultConstructorMarker) null));
        RhTextView rhTextView = getBinding().emailConfirmationDisclosure;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(ResourceUtils.getEmailVerificationDisclosure(resources, getAppType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(EmailConfirmationFragment emailConfirmationFragment) {
        emailConfirmationFragment.getDuxo().sendUserConsentedToDisclosureAndSendLink(((Args) INSTANCE.getArgs((Fragment) emailConfirmationFragment)).getToBeConfirmedEmail());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(EmailConfirmationFragment emailConfirmationFragment) {
        emailConfirmationFragment.getCallbacks().onChangeEmailClicked(((Args) INSTANCE.getArgs((Fragment) emailConfirmationFragment)).getVerificationType());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.verification.email.EmailConfirmationFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailConfirmationFragment.onStart$lambda$5(this.f$0, (EmailConfirmationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(EmailConfirmationFragment emailConfirmationFragment, EmailConfirmationViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        emailConfirmationFragment.onLoading(state instanceof EmailConfirmationViewState.Loading);
        if (!Intrinsics.areEqual(state, EmailConfirmationViewState.Loading.INSTANCE) && !Intrinsics.areEqual(state, EmailConfirmationViewState.Initial.INSTANCE)) {
            if (state instanceof EmailConfirmationViewState.LinkSentOrError) {
                emailConfirmationFragment.handleLinkSentOrErrorState((EmailConfirmationViewState.LinkSentOrError) state);
            } else {
                if (!(state instanceof EmailConfirmationViewState.VerificationWorkflow)) {
                    throw new NoWhenBranchMatchedException();
                }
                emailConfirmationFragment.handleVerificationWorkflowState((EmailConfirmationViewState.VerificationWorkflow) state);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) INSTANCE.getArgs((Fragment) this)).getVerificationType().ordinal()];
        if (i == 1) {
            requireActivity().finish();
            return true;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.verification.email.BaseEmailVerificationFragment
    public void onLoading(boolean isLoading) {
        super.onLoading(isLoading);
        getBinding().emailConfirmationChangeEmailBtn.setEnabled(!isLoading);
        getBinding().emailConfirmationPrimaryCta.setLoading(isLoading);
    }

    private final void handleLinkSentOrErrorState(EmailConfirmationViewState.LinkSentOrError state) {
        Either<String, Throwable> eitherConsume = state.getEvent().consume();
        if (eitherConsume != null) {
            if (eitherConsume instanceof Either.Left) {
                getCallbacks().onEmailConfirmed((String) ((Either.Left) eitherConsume).getValue());
            } else {
                if (!(eitherConsume instanceof Either.Right)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbsErrorHandler.handleError$default(getErrorHandler(), (Throwable) ((Either.Right) eitherConsume).getValue(), false, 2, null);
            }
        }
    }

    private final void handleVerificationWorkflowState(EmailConfirmationViewState.VerificationWorkflow state) {
        Tuples2<UUID, Boolean> tuples2Consume = state.getEvent().consume();
        if (tuples2Consume != null) {
            UUID uuidComponent1 = tuples2Consume.component1();
            Boolean boolComponent2 = tuples2Consume.component2();
            boolComponent2.booleanValue();
            this.launchSuv.invoke(uuidComponent1, boolComponent2);
        }
    }

    /* compiled from: EmailConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailConfirmationFragment$Args;", "Landroid/os/Parcelable;", "toBeConfirmedEmail", "", "verificationType", "Lcom/robinhood/android/verification/email/EmailVerificationType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/verification/email/EmailVerificationType;)V", "getToBeConfirmedEmail", "()Ljava/lang/String;", "getVerificationType", "()Lcom/robinhood/android/verification/email/EmailVerificationType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String toBeConfirmedEmail;
        private final EmailVerificationType verificationType;

        /* compiled from: EmailConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), EmailVerificationType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, EmailVerificationType emailVerificationType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.toBeConfirmedEmail;
            }
            if ((i & 2) != 0) {
                emailVerificationType = args.verificationType;
            }
            return args.copy(str, emailVerificationType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getToBeConfirmedEmail() {
            return this.toBeConfirmedEmail;
        }

        /* renamed from: component2, reason: from getter */
        public final EmailVerificationType getVerificationType() {
            return this.verificationType;
        }

        public final Args copy(String toBeConfirmedEmail, EmailVerificationType verificationType) {
            Intrinsics.checkNotNullParameter(toBeConfirmedEmail, "toBeConfirmedEmail");
            Intrinsics.checkNotNullParameter(verificationType, "verificationType");
            return new Args(toBeConfirmedEmail, verificationType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.toBeConfirmedEmail, args.toBeConfirmedEmail) && this.verificationType == args.verificationType;
        }

        public int hashCode() {
            return (this.toBeConfirmedEmail.hashCode() * 31) + this.verificationType.hashCode();
        }

        public String toString() {
            return "Args(toBeConfirmedEmail=" + this.toBeConfirmedEmail + ", verificationType=" + this.verificationType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.toBeConfirmedEmail);
            dest.writeString(this.verificationType.name());
        }

        public Args(String toBeConfirmedEmail, EmailVerificationType verificationType) {
            Intrinsics.checkNotNullParameter(toBeConfirmedEmail, "toBeConfirmedEmail");
            Intrinsics.checkNotNullParameter(verificationType, "verificationType");
            this.toBeConfirmedEmail = toBeConfirmedEmail;
            this.verificationType = verificationType;
        }

        public final String getToBeConfirmedEmail() {
            return this.toBeConfirmedEmail;
        }

        public final EmailVerificationType getVerificationType() {
            return this.verificationType;
        }
    }

    /* compiled from: EmailConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/verification/email/EmailConfirmationFragment;", "Lcom/robinhood/android/verification/email/EmailConfirmationFragment$Args;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EmailConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EmailConfirmationFragment emailConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, emailConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EmailConfirmationFragment newInstance(Args args) {
            return (EmailConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EmailConfirmationFragment emailConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, emailConfirmationFragment, args);
        }
    }
}
