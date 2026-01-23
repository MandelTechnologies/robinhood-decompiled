package com.robinhood.android.designsystem.numpad;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.utils.extensions.KProperties2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty6;

/* compiled from: RdsNumpadContainerView.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\tJ\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\tJ\u0006\u0010\b\u001a\u00020\u001fJ\b\u0010/\u001a\u00020\u001fH\u0014J\b\u00100\u001a\u00020\u001fH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R$\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R!\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/designsystem/numpad/RdsNumpadContainerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "useDefaultKeyHandler", "", "button", "Lcom/robinhood/android/designsystem/button/RdsButton;", "numpadView", "Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", "value", "", "buttonText", "getButtonText", "()Ljava/lang/CharSequence;", "setButtonText", "(Ljava/lang/CharSequence;)V", "isButtonEnabled", "()Z", "setButtonEnabled", "(Z)V", "isButtonLoading", "setButtonLoading", "isNumpadVisible", "setNumpadVisible", "onButtonClick", "Lkotlin/Function0;", "", "getOnButtonClick", "()Lkotlin/jvm/functions/Function0;", "setOnButtonClick", "(Lkotlin/jvm/functions/Function0;)V", "keyEvents", "Lio/reactivex/Observable;", "Landroid/view/KeyEvent;", "getKeyEvents", "()Lio/reactivex/Observable;", "keyEvents$delegate", "Lkotlin/reflect/KProperty0;", "setDelimiterEnabled", "delimiterEnabled", "setDelimiterLocalized", "delimiterLocalized", "onAttachedToWindow", "subscribeToKeyEvents", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsNumpadContainerView extends LinearLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RdsNumpadContainerView.class, "keyEvents", "getKeyEvents()Lio/reactivex/Observable;", 0))};
    private final RdsButton button;

    /* renamed from: keyEvents$delegate, reason: from kotlin metadata */
    private final KProperty6 keyEvents;
    private final RdsNumpadView numpadView;
    private Function0<Unit> onButtonClick;
    private boolean useDefaultKeyHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsNumpadContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        View.inflate(context, C13997R.layout.merge_rds_numpad_container, this);
        View viewFindViewById = findViewById(C13997R.id.numpad_container_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RdsButton rdsButton = (RdsButton) viewFindViewById;
        this.button = rdsButton;
        View viewFindViewById2 = findViewById(C13997R.id.numpad_container_numpad);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final RdsNumpadView rdsNumpadView = (RdsNumpadView) viewFindViewById2;
        this.numpadView = rdsNumpadView;
        this.keyEvents = new PropertyReference0Impl(rdsNumpadView) { // from class: com.robinhood.android.designsystem.numpad.RdsNumpadContainerView$keyEvents$2
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((RdsNumpadView) this.receiver).getKeyEvents();
            }
        };
        int[] RdsNumpadContainerView = C13997R.styleable.RdsNumpadContainerView;
        Intrinsics.checkNotNullExpressionValue(RdsNumpadContainerView, "RdsNumpadContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsNumpadContainerView, 0, 0);
        setButtonText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsNumpadContainerView_buttonText));
        rdsNumpadView.setDelimiterEnabled(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsNumpadContainerView_delimiterEnabled, true));
        typedArrayObtainStyledAttributes.recycle();
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.designsystem.numpad.RdsNumpadContainerView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RdsNumpadContainerView._init_$lambda$1(this.f$0);
            }
        });
    }

    public final CharSequence getButtonText() {
        return this.button.getText().toString();
    }

    public final void setButtonText(CharSequence charSequence) {
        this.button.setText(charSequence);
    }

    public final boolean isButtonEnabled() {
        return this.button.isEnabled();
    }

    public final void setButtonEnabled(boolean z) {
        this.button.setEnabled(z);
    }

    public final boolean isButtonLoading() {
        return this.button.getIsLoading();
    }

    public final void setButtonLoading(boolean z) {
        this.button.setLoading(z);
    }

    public final boolean isNumpadVisible() {
        return this.numpadView.getVisibility() == 0;
    }

    public final void setNumpadVisible(boolean z) {
        this.numpadView.setVisibility(z ? 0 : 8);
    }

    public final Function0<Unit> getOnButtonClick() {
        return this.onButtonClick;
    }

    public final void setOnButtonClick(Function0<Unit> function0) {
        this.onButtonClick = function0;
    }

    public final Observable<KeyEvent> getKeyEvents() {
        return (Observable) KProperties2.getValue(this.keyEvents, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(RdsNumpadContainerView rdsNumpadContainerView) {
        Function0<Unit> function0 = rdsNumpadContainerView.onButtonClick;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void setDelimiterEnabled(boolean delimiterEnabled) {
        this.numpadView.setDelimiterEnabled(delimiterEnabled);
    }

    public final void setDelimiterLocalized(boolean delimiterLocalized) {
        this.numpadView.setDelimiterLocalized(delimiterLocalized);
    }

    public final void useDefaultKeyHandler() {
        if (this.useDefaultKeyHandler) {
            return;
        }
        this.useDefaultKeyHandler = true;
        if (isAttachedToWindow()) {
            subscribeToKeyEvents();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useDefaultKeyHandler) {
            subscribeToKeyEvents();
        }
    }

    private final void subscribeToKeyEvents() {
        ViewDisposerKt.bindTo$default(getKeyEvents(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.designsystem.numpad.RdsNumpadContainerView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RdsNumpadContainerView.subscribeToKeyEvents$lambda$2(this.f$0, (KeyEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToKeyEvents$lambda$2(RdsNumpadContainerView rdsNumpadContainerView, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Context context = rdsNumpadContainerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
        Intrinsics.checkNotNull(appCompatActivityRequireActivityBaseContext, "null cannot be cast to non-null type android.app.Activity");
        View currentFocus = appCompatActivityRequireActivityBaseContext.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.dispatchKeyEvent(keyEvent);
        }
        return Unit.INSTANCE;
    }
}
