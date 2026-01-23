package com.robinhood.android.designsystem.numpad;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.jakewharton.rxrelay2.PublishRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsNumpadView.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\tJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\tJ\b\u0010 \u001a\u00020\u001aH\u0002J\u0006\u0010\b\u001a\u00020\u001aJ\b\u0010!\u001a\u00020\u001aH\u0014J\b\u0010\"\u001a\u00020\u001aH\u0002J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0018H\u0002J\u0018\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0002J\f\u0010(\u001a\u00020\u001a*\u00020\u0018H\u0002J\f\u0010)\u001a\u00020\u001a*\u00020\u0018H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "useDefaultKeyHandler", "", "keyEventRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Landroid/view/KeyEvent;", "kotlin.jvm.PlatformType", "keyEvents", "Lio/reactivex/Observable;", "getKeyEvents", "()Lio/reactivex/Observable;", "onButtonTouchedListener", "Landroid/view/View$OnTouchListener;", "onButtonClickedListener", "Landroid/view/View$OnClickListener;", "decimalSeparatorKeyEvent", "delimiterButton", "Landroid/view/View;", "setEnabled", "", "enabled", "setDelimiterEnabled", "delimiterEnabled", "setDelimiterLocalized", "delimiterLocalized", "updateDelimiter", "onAttachedToWindow", "subscribeToKeyEvents", "onButtonClicked", "view", "onButtonTouched", "event", "Landroid/view/MotionEvent;", "removeNumpadButtonTouchAndClickListeners", "setNumpadButtonTouchAndClickListeners", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsNumpadView extends Hammer_RdsNumpadView {
    private KeyEvent decimalSeparatorKeyEvent;
    private final View delimiterButton;
    private final PublishRelay<KeyEvent> keyEventRelay;
    private final Observable<KeyEvent> keyEvents;
    private final View.OnClickListener onButtonClickedListener;
    private final View.OnTouchListener onButtonTouchedListener;
    private boolean useDefaultKeyHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsNumpadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        PublishRelay<KeyEvent> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.keyEventRelay = publishRelayCreate;
        Observable<KeyEvent> observableHide = publishRelayCreate.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        this.keyEvents = observableHide;
        this.onButtonTouchedListener = new View.OnTouchListener() { // from class: com.robinhood.android.designsystem.numpad.RdsNumpadView$onButtonTouchedListener$1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View p0, MotionEvent p1) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                return this.$tmp0.onButtonTouched(p0, p1);
            }
        };
        this.onButtonClickedListener = new View.OnClickListener() { // from class: com.robinhood.android.designsystem.numpad.RdsNumpadView$onButtonClickedListener$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                this.$tmp0.onButtonClicked(p0);
            }
        };
        int[] RdsNumpadView = C13997R.styleable.RdsNumpadView;
        Intrinsics.checkNotNullExpressionValue(RdsNumpadView, "RdsNumpadView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsNumpadView, 0, 0);
        View.inflate(context, typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsNumpadView_includeLetters, false) ? C13997R.layout.merge_rds_numpad_view_with_letters_bento : C13997R.layout.merge_rds_numpad_view_bento, this);
        typedArrayObtainStyledAttributes.recycle();
        View viewFindViewById = findViewById(C13997R.id.numpad_delimiter_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.delimiterButton = viewFindViewById;
        int[] RdsNumpadView2 = C13997R.styleable.RdsNumpadView;
        Intrinsics.checkNotNullExpressionValue(RdsNumpadView2, "RdsNumpadView");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, RdsNumpadView2, 0, 0);
        setDelimiterEnabled(typedArrayObtainStyledAttributes2.getBoolean(C13997R.styleable.RdsNumpadView_delimiterEnabled, true));
        if (typedArrayObtainStyledAttributes2.getBoolean(C13997R.styleable.RdsNumpadView_delimiterLocalized, false)) {
            updateDelimiter();
        }
        typedArrayObtainStyledAttributes2.recycle();
        int[] iArr = {C13997R.id.numpad_one_button, C13997R.id.numpad_two_button, C13997R.id.numpad_three_button, C13997R.id.numpad_four_button, C13997R.id.numpad_five_button, C13997R.id.numpad_six_button, C13997R.id.numpad_seven_button, C13997R.id.numpad_eight_button, C13997R.id.numpad_nine_button, C13997R.id.numpad_zero_button, C13997R.id.numpad_backspace_button};
        for (int i = 0; i < 11; i++) {
            View viewFindViewById2 = findViewById(iArr[i]);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            setNumpadButtonTouchAndClickListeners(viewFindViewById2);
        }
        setNumpadButtonTouchAndClickListeners(this.delimiterButton);
    }

    public final Observable<KeyEvent> getKeyEvents() {
        return this.keyEvents;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        int[] iArr = {C13997R.id.numpad_one_button, C13997R.id.numpad_two_button, C13997R.id.numpad_three_button, C13997R.id.numpad_four_button, C13997R.id.numpad_five_button, C13997R.id.numpad_six_button, C13997R.id.numpad_seven_button, C13997R.id.numpad_eight_button, C13997R.id.numpad_nine_button, C13997R.id.numpad_zero_button, C13997R.id.numpad_backspace_button};
        for (int i = 0; i < 11; i++) {
            int i2 = iArr[i];
            if (enabled) {
                View viewFindViewById = findViewById(i2);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                setNumpadButtonTouchAndClickListeners(viewFindViewById);
            } else {
                View viewFindViewById2 = findViewById(i2);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                removeNumpadButtonTouchAndClickListeners(viewFindViewById2);
            }
        }
        if (enabled) {
            setNumpadButtonTouchAndClickListeners(this.delimiterButton);
        } else {
            removeNumpadButtonTouchAndClickListeners(this.delimiterButton);
        }
    }

    public final void setDelimiterEnabled(boolean delimiterEnabled) {
        this.delimiterButton.setVisibility(!delimiterEnabled ? 4 : 0);
    }

    public final void setDelimiterLocalized(boolean delimiterLocalized) {
        if (delimiterLocalized) {
            updateDelimiter();
        }
    }

    private final void updateDelimiter() {
        Tuples2<Character, KeyEvent> decimalSeparator = Locales2.getDecimalSeparator(CurrencyFormatterLocale.INSTANCE.getInstance().getNumpadLocale());
        char cCharValue = decimalSeparator.component1().charValue();
        KeyEvent keyEventComponent2 = decimalSeparator.component2();
        View view = this.delimiterButton;
        if (view instanceof LinearLayout) {
            ((RhTextView) view.findViewById(C13997R.id.numpad_delimiter_button_text)).setText(String.valueOf(cCharValue));
        } else if (view instanceof RdsButton) {
            ((RdsButton) view).setText(String.valueOf(cCharValue));
        }
        this.decimalSeparatorKeyEvent = keyEventComponent2;
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
        ViewDisposerKt.bindTo$default(this.keyEvents, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.designsystem.numpad.RdsNumpadView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RdsNumpadView.subscribeToKeyEvents$lambda$5(this.f$0, (KeyEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToKeyEvents$lambda$5(RdsNumpadView rdsNumpadView, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Context context = rdsNumpadView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
        Intrinsics.checkNotNull(appCompatActivityRequireActivityBaseContext, "null cannot be cast to non-null type android.app.Activity");
        View currentFocus = appCompatActivityRequireActivityBaseContext.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.dispatchKeyEvent(keyEvent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onButtonClicked(View view) {
        KeyEvent keyEvent;
        int id = view.getId();
        if (id == C13997R.id.numpad_one_button) {
            keyEvent = new KeyEvent(0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE);
        } else if (id == C13997R.id.numpad_two_button) {
            keyEvent = new KeyEvent(0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE);
        } else if (id == C13997R.id.numpad_three_button) {
            keyEvent = new KeyEvent(0, 147);
        } else if (id == C13997R.id.numpad_four_button) {
            keyEvent = new KeyEvent(0, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
        } else if (id == C13997R.id.numpad_five_button) {
            keyEvent = new KeyEvent(0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE);
        } else if (id == C13997R.id.numpad_six_button) {
            keyEvent = new KeyEvent(0, 150);
        } else if (id == C13997R.id.numpad_seven_button) {
            keyEvent = new KeyEvent(0, 151);
        } else if (id == C13997R.id.numpad_eight_button) {
            keyEvent = new KeyEvent(0, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
        } else if (id == C13997R.id.numpad_nine_button) {
            keyEvent = new KeyEvent(0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE);
        } else if (id == C13997R.id.numpad_zero_button) {
            keyEvent = new KeyEvent(0, 144);
        } else if (id == C13997R.id.numpad_delimiter_button) {
            keyEvent = this.decimalSeparatorKeyEvent;
            if (keyEvent == null) {
                keyEvent = new KeyEvent(0, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
            }
        } else {
            if (id != C13997R.id.numpad_backspace_button) {
                throw new IllegalStateException("Unknown numpad button clicked!");
            }
            keyEvent = new KeyEvent(0, 67);
        }
        this.keyEventRelay.accept(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onButtonTouched(View view, MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            if (Build.VERSION.SDK_INT >= 27) {
                view.performHapticFeedback(3);
                return false;
            }
            view.performHapticFeedback(3);
            return false;
        }
        if (action != 1 || Build.VERSION.SDK_INT < 27) {
            return false;
        }
        view.performHapticFeedback(7);
        return false;
    }

    private final void removeNumpadButtonTouchAndClickListeners(View view) {
        view.setOnTouchListener(null);
        view.setOnClickListener(null);
    }

    private final void setNumpadButtonTouchAndClickListeners(View view) {
        view.setOnTouchListener(this.onButtonTouchedListener);
        view.setOnClickListener(this.onButtonClickedListener);
    }
}
