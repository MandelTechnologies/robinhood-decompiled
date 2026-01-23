package com.robinhood.android.common.mcduckling.p084ui.card.pin;

import android.content.Context;
import android.os.Bundle;
import android.transition.TransitionSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.common.mcduckling.databinding.FragmentChangeCardPinBinding;
import com.robinhood.android.common.mcduckling.p084ui.WizardFragment;
import com.robinhood.android.common.mcduckling.p084ui.card.pin.ChangeCardPinFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ChangeCardPinFragment.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0002>?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u001a\u00103\u001a\u0002002\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u000200H\u0016J\b\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u0002002\u0006\u0010<\u001a\u00020=H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0012\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0012\u001a\u0004\b,\u0010-¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/card/pin/ChangeCardPinFragment;", "Lcom/robinhood/android/common/mcduckling/ui/WizardFragment;", "<init>", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "title$delegate", "Lkotlin/Lazy;", ChangeCardPinFragment.ARG_PROMPT_MESSAGE, "getPromptMessage", "promptMessage$delegate", "binding", "Lcom/robinhood/android/common/mcduckling/databinding/FragmentChangeCardPinBinding;", "getBinding", "()Lcom/robinhood/android/common/mcduckling/databinding/FragmentChangeCardPinBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "promptTitleTxt", "Landroid/widget/TextView;", "getPromptTitleTxt", "()Landroid/widget/TextView;", "promptTitleTxt$delegate", "promptTxt", "getPromptTxt", "promptTxt$delegate", "pinInputEdt", "Landroid/widget/EditText;", "getPinInputEdt", "()Landroid/widget/EditText;", "pinInputEdt$delegate", "dotIndicators", "Lcom/robinhood/android/common/ui/view/DotIndicators;", "getDotIndicators", "()Lcom/robinhood/android/common/ui/view/DotIndicators;", "dotIndicators$delegate", ChangeCardPinFragment.NUMPAD_TRANSITION_NAME, "Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", "getNumpad", "()Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", "numpad$delegate", "callbacks", "Lcom/robinhood/android/common/mcduckling/ui/card/pin/ChangeCardPinFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/mcduckling/ui/card/pin/ChangeCardPinFragment$Callbacks;", "callbacks$delegate", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onBackPressed", "", "addSharedElements", "fragmentTransaction", "Landroidx/fragment/app/FragmentTransaction;", "Callbacks", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ChangeCardPinFragment extends WizardFragment {
    private static final String ARG_PROMPT_MESSAGE = "promptMessage";
    private static final String ARG_TITLE = "title";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: dotIndicators$delegate, reason: from kotlin metadata */
    private final Interfaces2 dotIndicators;

    /* renamed from: numpad$delegate, reason: from kotlin metadata */
    private final Interfaces2 numpad;

    /* renamed from: pinInputEdt$delegate, reason: from kotlin metadata */
    private final Interfaces2 pinInputEdt;

    /* renamed from: promptMessage$delegate, reason: from kotlin metadata */
    private final Lazy promptMessage;

    /* renamed from: promptTitleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 promptTitleTxt;

    /* renamed from: promptTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 promptTxt;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    private final Lazy title;
    private static final String NUMPAD_TRANSITION_NAME = "numpad";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChangeCardPinFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/mcduckling/databinding/FragmentChangeCardPinBinding;", 0)), Reflection.property1(new PropertyReference1Impl(ChangeCardPinFragment.class, "promptTitleTxt", "getPromptTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(ChangeCardPinFragment.class, "promptTxt", "getPromptTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(ChangeCardPinFragment.class, "pinInputEdt", "getPinInputEdt()Landroid/widget/EditText;", 0)), Reflection.property1(new PropertyReference1Impl(ChangeCardPinFragment.class, "dotIndicators", "getDotIndicators()Lcom/robinhood/android/common/ui/view/DotIndicators;", 0)), Reflection.property1(new PropertyReference1Impl(ChangeCardPinFragment.class, NUMPAD_TRANSITION_NAME, "getNumpad()Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", 0)), Reflection.property1(new PropertyReference1Impl(ChangeCardPinFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/mcduckling/ui/card/pin/ChangeCardPinFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: ChangeCardPinFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/card/pin/ChangeCardPinFragment$Callbacks;", "", "onPinEntered", "", "pin", "", "onPinCancel", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPinCancel();

        void onPinEntered(String pin);
    }

    public ChangeCardPinFragment() {
        super(C11257R.layout.fragment_change_card_pin);
        this.title = Fragments2.argument(this, "title");
        this.promptMessage = Fragments2.argument(this, ARG_PROMPT_MESSAGE);
        this.binding = ViewBinding5.viewBinding(this, ChangeCardPinFragment2.INSTANCE);
        this.promptTitleTxt = bindView(C11257R.id.pin_input_title);
        this.promptTxt = bindView(C11257R.id.pin_input_prompt_txt);
        this.pinInputEdt = bindView(C11257R.id.pin_input_edt);
        this.dotIndicators = bindView(C11257R.id.pin_dot_indicators);
        this.numpad = bindView(C11257R.id.numpad);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.mcduckling.ui.card.pin.ChangeCardPinFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof ChangeCardPinFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        SimpleSlide simpleSlide = new SimpleSlide(8388613);
        Interpolators interpolators = Interpolators.INSTANCE;
        simpleSlide.setInterpolator(interpolators.getFastOutSlowIn());
        setEnterTransition(simpleSlide);
        SimpleSlide simpleSlide2 = new SimpleSlide(8388611);
        simpleSlide2.setInterpolator(interpolators.getFastOutSlowIn());
        setExitTransition(simpleSlide2);
        setSharedElementEnterTransition(new TransitionSet());
        setSharedElementReturnTransition(new TransitionSet());
    }

    private final String getTitle() {
        return (String) this.title.getValue();
    }

    private final String getPromptMessage() {
        return (String) this.promptMessage.getValue();
    }

    private final FragmentChangeCardPinBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentChangeCardPinBinding) value;
    }

    private final TextView getPromptTitleTxt() {
        return (TextView) this.promptTitleTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getPromptTxt() {
        return (TextView) this.promptTxt.getValue(this, $$delegatedProperties[2]);
    }

    private final EditText getPinInputEdt() {
        return (EditText) this.pinInputEdt.getValue(this, $$delegatedProperties[3]);
    }

    private final DotIndicators getDotIndicators() {
        return (DotIndicators) this.dotIndicators.getValue(this, $$delegatedProperties[4]);
    }

    private final RdsNumpadView getNumpad() {
        return (RdsNumpadView) this.numpad.getValue(this, $$delegatedProperties[5]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[6]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.mcduckling.p084ui.WizardFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getPromptTitleTxt().setText(getTitle());
        getPromptTxt().setText(getPromptMessage());
        getNumpad().setTransitionName(NUMPAD_TRANSITION_NAME);
        RdsNumpadView numpad = getBinding().numpad;
        Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(numpad, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, getNumpad().getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.card.pin.ChangeCardPinFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChangeCardPinFragment.onStart$lambda$2(this.f$0, (KeyEvent) obj);
            }
        });
        Observable<CharSequence> observableRefCount = RxTextView.textChanges(getPinInputEdt()).skip(1L).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.card.pin.ChangeCardPinFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChangeCardPinFragment.onStart$lambda$3(this.f$0, (CharSequence) obj);
            }
        });
        Observable<CharSequence> observableFilter = observableRefCount.filter(new Predicate() { // from class: com.robinhood.android.common.mcduckling.ui.card.pin.ChangeCardPinFragment.onStart.3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.length() == 4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.mcduckling.ui.card.pin.ChangeCardPinFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChangeCardPinFragment.onStart$lambda$4(this.f$0, (CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(ChangeCardPinFragment changeCardPinFragment, KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        changeCardPinFragment.getPinInputEdt().dispatchKeyEvent(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(ChangeCardPinFragment changeCardPinFragment, CharSequence charSequence) {
        changeCardPinFragment.getDotIndicators().setNumActivated(charSequence.length());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(ChangeCardPinFragment changeCardPinFragment, CharSequence charSequence) {
        changeCardPinFragment.getCallbacks().onPinEntered(charSequence.toString());
        changeCardPinFragment.getPinInputEdt().setText((CharSequence) null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onPinCancel();
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.mcduckling.p084ui.WizardFragment
    public void addSharedElements(FragmentTransaction fragmentTransaction) {
        Intrinsics.checkNotNullParameter(fragmentTransaction, "fragmentTransaction");
        super.addSharedElements(fragmentTransaction);
        fragmentTransaction.addSharedElement(getNumpad(), NUMPAD_TRANSITION_NAME);
    }

    /* compiled from: ChangeCardPinFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/card/pin/ChangeCardPinFragment$Companion;", "", "<init>", "()V", "ARG_PROMPT_MESSAGE", "", "ARG_TITLE", "NUMPAD_TRANSITION_NAME", "newInstance", "Lcom/robinhood/android/common/mcduckling/ui/card/pin/ChangeCardPinFragment;", ChangeCardPinFragment.ARG_PROMPT_MESSAGE, "title", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ChangeCardPinFragment newInstance$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.newInstance(str, str2);
        }

        public final ChangeCardPinFragment newInstance(String promptMessage, String title) {
            Intrinsics.checkNotNullParameter(promptMessage, "promptMessage");
            ChangeCardPinFragment changeCardPinFragment = new ChangeCardPinFragment();
            Bundle bundle = new Bundle();
            bundle.putString("title", title);
            bundle.putString(ChangeCardPinFragment.ARG_PROMPT_MESSAGE, promptMessage);
            changeCardPinFragment.setArguments(bundle);
            return changeCardPinFragment;
        }
    }
}
