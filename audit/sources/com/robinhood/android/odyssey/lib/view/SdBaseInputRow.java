package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.card.MaterialCardView;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.jakewharton.rxbinding3.widget.TextViewEditorActionEvent;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.designsystem.textinput.RdsGenericTextInput;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdBaseInputRow;
import com.robinhood.android.odyssey.lib.view.SdBaseInputRow.Callbacks;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.android.odyssey.lib.view.SdIconDrawableRes;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseInputComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseInputComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdIcon;
import com.robinhood.models.api.serverdrivenui.component.ApiSdInputComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdInputComponentValidator;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPhoneInputComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.text.CharacterSetInputFilter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: SdBaseInputRow.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 R*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u00072\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\b:\u0004OPQRB\u0019\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020-H\u0014J\u001d\u00101\u001a\u00020-2\u0006\u00102\u001a\u00028\u00012\u0006\u00103\u001a\u000204H\u0017¢\u0006\u0002\u00105J\n\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u00020\u0010H\u0014J\b\u00109\u001a\u00020:H&J0\u0010;\u001a\u00020-2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 J\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aH\u0014J\b\u0010B\u001a\u00020CH\u0004J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aH\u0002J\u0010\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020GH\u0002J\b\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020-H\u0002J\b\u0010K\u001a\u00020LH\u0014J\u0012\u0010M\u001a\u00020-2\b\u0010N\u001a\u0004\u0018\u00010LH\u0014R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00108DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u00100\u00100\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u00100\u00100%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0013R$\u0010'\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0018R\u001e\u0010*\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b+\u0010\u0018¨\u0006S"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow;", "T", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseInputComponent;", "D", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseInputComponentData;", "C", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow$Callbacks;", "Lcom/robinhood/android/designsystem/textinput/RdsTextInputContainerView;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "validationEndpointRequired", "getValidationEndpointRequired", "()Z", "isInputRequired", "templated", "getTemplated", "setTemplated", "(Z)V", "numpadEventObservable", "Lio/reactivex/Observable;", "Landroid/view/KeyEvent;", "validators", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInputComponentValidator;", "filledCallbacks", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow$FilledCallbacks;", "showNumpadAtBeginningRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "kotlin.jvm.PlatformType", "isInputRequiredRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "isMultiline", "useCustomNumpad", "getUseCustomNumpad", "setUseCustomNumpad", "isImeOptionDone", "setImeOptionDone", "bind", "", "component", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseInputComponent;)V", "onAttachedToWindow", "onDataUpdated", "newData", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseInputComponentData;Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;)V", "onSubmitValue", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue$ApiSdString;", "isValidInput", "getTypedText", "", "configInput", "showKeyboardOrNumpadAfterConfig", "isLastIndex", "textChanges", "Lcom/jakewharton/rxbinding3/InitialValueObservable;", "", "isFilled", "requireEditText", "Lcom/robinhood/android/designsystem/textinput/RdsGenericTextInput;", "isFilledOrOptional", "setInputType", "inputType", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseInputComponentData$InputType;", "getAutoCapTextInputType", "", "setMultiline", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Callbacks", "FilledCallbacks", "InputSavedState", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public abstract class SdBaseInputRow<T extends ApiSdBaseInputComponent, D extends ApiSdBaseInputComponentData, C extends Callbacks> extends RdsTextInputContainerView implements SdBaseView<T, D, C> {
    private static final int MULTILINE_MAX_LINES_COUNT = 5;
    private FilledCallbacks filledCallbacks;
    private boolean isImeOptionDone;
    private final BehaviorRelay<Boolean> isInputRequiredRelay;
    private Observable<KeyEvent> numpadEventObservable;
    private final PublishRelay<Boolean> showNumpadAtBeginningRelay;
    private boolean templated;
    private boolean validationEndpointRequired;
    private List<ApiSdInputComponentValidator> validators;
    public static final int $stable = 8;

    /* compiled from: SdBaseInputRow.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow$Callbacks;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "showCustomNumpad", "", "showNumpad", "", "keyboardFocusOnEditText", "editText", "Landroid/widget/EditText;", "onEnterOrDonePressed", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends SdBaseView.Callbacks {
        void keyboardFocusOnEditText(EditText editText);

        void onEnterOrDonePressed();

        void showCustomNumpad(boolean showNumpad);
    }

    /* compiled from: SdBaseInputRow.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow$FilledCallbacks;", "", "isInputFilledOrOptional", "", "isFilled", "", "tag", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface FilledCallbacks {
        void isInputFilledOrOptional(boolean isFilled, String tag);
    }

    /* compiled from: SdBaseInputRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiSdBaseInputComponentData.InputType.values().length];
            try {
                iArr[ApiSdBaseInputComponentData.InputType.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSdBaseInputComponentData.InputType.ALPHABETIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiSdBaseInputComponentData.InputType.ALPHANUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiSdBaseInputComponentData.InputType.STRICT_ALPHANUMERIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiSdBaseInputComponentData.InputType.ONE_TIME_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiSdBaseInputComponentData.AutoCapitalizeType.values().length];
            try {
                iArr2[ApiSdBaseInputComponentData.AutoCapitalizeType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiSdBaseInputComponentData.AutoCapitalizeType.CHARACTERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiSdBaseInputComponentData.AutoCapitalizeType.WORDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ApiSdBaseInputComponentData.AutoCapitalizeType.SENTENCES.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public abstract String getTypedText();

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onRestoreState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onRestoreState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onSaveState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onSaveState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap() {
        return SdBaseView.DefaultImpls.requireAlternateComponentOnSubmitValueMap(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public C requireComponentCallbacks() {
        return (C) SdBaseView.DefaultImpls.requireComponentCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public View requireSdView() {
        return SdBaseView.DefaultImpls.requireSdView(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void update(D d, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, d, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdBaseInputRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        PublishRelay<Boolean> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.showNumpadAtBeginningRelay = publishRelayCreate;
        BehaviorRelay<Boolean> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.isInputRequiredRelay = behaviorRelayCreateDefault;
    }

    public final boolean getValidationEndpointRequired() {
        return this.validationEndpointRequired;
    }

    protected final boolean isInputRequired() {
        return !Intrinsics.areEqual(this.isInputRequiredRelay.getValue(), Boolean.FALSE);
    }

    protected final boolean getTemplated() {
        return this.templated;
    }

    protected final void setTemplated(boolean z) {
        this.templated = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMultiline() {
        D data = getData();
        if (data != null) {
            return Intrinsics.areEqual(data.getMultiline(), Boolean.TRUE);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getUseCustomNumpad() {
        return requireEditText().getUseCustomNumpad();
    }

    private final void setUseCustomNumpad(boolean z) {
        requireEditText().setUseCustomNumpad(z);
    }

    private final void setImeOptionDone(boolean z) {
        this.isImeOptionDone = z;
        requireEditText().setImeOptions(!z ? 5 : 6);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(T component) {
        Intrinsics.checkNotNullParameter(component, "component");
        if (component instanceof ApiSdInputComponent) {
            this.validators = ((ApiSdInputComponent) component).getValidators();
        } else if (component instanceof ApiSdPhoneInputComponent) {
            this.validators = ((ApiSdPhoneInputComponent) component).getData().getValidators();
        }
        this.validationEndpointRequired = component.getValidation_endpoint_required();
        SdBaseView.DefaultImpls.bind(this, component);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(RxTextView.textChanges(requireEditText()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.view.SdBaseInputRow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdBaseInputRow.onAttachedToWindow$lambda$0(this.f$0, (CharSequence) obj);
            }
        });
        Observable observableSwitchMap = Observable.merge(requireEditText().focusChanges(), this.showNumpadAtBeginningRelay).filter(new Predicate() { // from class: com.robinhood.android.odyssey.lib.view.SdBaseInputRow.onAttachedToWindow.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        }).doOnNext(new Consumer(this) { // from class: com.robinhood.android.odyssey.lib.view.SdBaseInputRow.onAttachedToWindow.3
            final /* synthetic */ SdBaseInputRow<T, D, C> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Boolean bool) {
                ((Callbacks) this.this$0.requireComponentCallbacks()).showCustomNumpad(this.this$0.getUseCustomNumpad());
            }
        }).filter(new Predicate(this) { // from class: com.robinhood.android.odyssey.lib.view.SdBaseInputRow.onAttachedToWindow.4
            final /* synthetic */ SdBaseInputRow<T, D, C> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.getUseCustomNumpad();
            }
        }).switchMap(new Function(this) { // from class: com.robinhood.android.odyssey.lib.view.SdBaseInputRow.onAttachedToWindow.5
            final /* synthetic */ SdBaseInputRow<T, D, C> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends KeyEvent> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Observable observable = ((SdBaseInputRow) this.this$0).numpadEventObservable;
                if (observable != null) {
                    return observable;
                }
                Intrinsics.throwUninitializedPropertyAccessException("numpadEventObservable");
                return null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ViewDisposerKt.bindTo$default(observableSwitchMap, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.view.SdBaseInputRow$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdBaseInputRow.onAttachedToWindow$lambda$1(this.f$0, (KeyEvent) obj);
            }
        });
        Observable<TextViewEditorActionEvent> observableFilter = requireEditText().onEnterOrDonePressed().filter(new Predicate(this) { // from class: com.robinhood.android.odyssey.lib.view.SdBaseInputRow.onAttachedToWindow.7
            final /* synthetic */ SdBaseInputRow<T, D, C> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Predicate
            public final boolean test(TextViewEditorActionEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return !this.this$0.isMultiline();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        ViewDisposerKt.bindTo$default(observableFilter, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.view.SdBaseInputRow$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdBaseInputRow.onAttachedToWindow$lambda$2(this.f$0, (TextViewEditorActionEvent) obj);
            }
        });
        ViewDisposerKt.bindTo$default(isFilledOrOptional(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.view.SdBaseInputRow$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdBaseInputRow.onAttachedToWindow$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(SdBaseInputRow sdBaseInputRow, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        sdBaseInputRow.setErrorText(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(SdBaseInputRow sdBaseInputRow, KeyEvent keyEvent) {
        sdBaseInputRow.dispatchKeyEvent(keyEvent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(SdBaseInputRow sdBaseInputRow, TextViewEditorActionEvent textViewEditorActionEvent) {
        ((Callbacks) sdBaseInputRow.requireComponentCallbacks()).onEnterOrDonePressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$3(SdBaseInputRow sdBaseInputRow, boolean z) {
        FilledCallbacks filledCallbacks = sdBaseInputRow.filledCallbacks;
        if (filledCallbacks != null) {
            Object tag = sdBaseInputRow.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
            filledCallbacks.isInputFilledOrOptional(z, (String) tag);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(D newData, SdBaseView.UpdateSource updateSource) {
        ApiSdIcon.ApiSdIconData data;
        ApiSdIcon.IconType type2;
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        String default_text = newData.getDefault_text();
        if (default_text != null) {
            if (this.templated) {
                requireEditText().setTypedText(default_text);
            } else {
                requireEditText().setText(default_text);
                requireEditText().setSelection(default_text.length());
            }
        }
        ApiSdIcon icon = newData.getIcon();
        if (icon != null) {
            SdIconDrawableRes.Companion companion = SdIconDrawableRes.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable drawable = companion.getDrawable(icon, context);
            if (drawable != null) {
                ApiSdIcon icon2 = newData.getIcon();
                setStartIcon(drawable, (icon2 == null || (data = icon2.getData()) == null || (type2 = data.getType()) == null) ? null : type2.getServerValue());
            }
        }
        ApiSdBaseInputComponentData.InputType input_type = newData.getInput_type();
        if (input_type != null) {
            setInputType(input_type);
        }
        setMultiline();
        String error_message = newData.getError_message();
        if (error_message != null) {
            new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.odyssey.lib.view.SdBaseInputRow$onDataUpdated$1$5
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((SdBaseInputRow) this.receiver).getErrorText();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((SdBaseInputRow) this.receiver).setErrorText((CharSequence) obj);
                }
            }.set(error_message);
        }
        Boolean required = newData.getRequired();
        if (required != null) {
            this.isInputRequiredRelay.accept(required);
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTypedValue.ApiSdString onSubmitValue() {
        String typedText = getTypedText();
        List<ApiSdInputComponentValidator> list = this.validators;
        if (list != null) {
            for (ApiSdInputComponentValidator apiSdInputComponentValidator : list) {
                if (!new Regex(apiSdInputComponentValidator.getRegex()).matches(typedText)) {
                    setErrorText(apiSdInputComponentValidator.getError_message());
                    return null;
                }
            }
        }
        return new ApiSdTypedValue.ApiSdString(typedText);
    }

    protected boolean isValidInput() {
        Editable text;
        return (this.templated && ((isInputRequired() && requireEditText().isValid()) || (!isInputRequired() && (requireEditText().getTypedText().length() == 0 || requireEditText().isValid())))) || (!this.templated && (((text = requireEditText().getText()) != null && text.length() != 0) || !isInputRequired()));
    }

    public static /* synthetic */ void configInput$default(SdBaseInputRow sdBaseInputRow, Observable observable, boolean z, boolean z2, FilledCallbacks filledCallbacks, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configInput");
        }
        if ((i & 8) != 0) {
            filledCallbacks = null;
        }
        sdBaseInputRow.configInput(observable, z, z2, filledCallbacks);
    }

    public final void configInput(Observable<KeyEvent> numpadEventObservable, boolean showKeyboardOrNumpadAfterConfig, boolean isLastIndex, FilledCallbacks filledCallbacks) {
        Intrinsics.checkNotNullParameter(numpadEventObservable, "numpadEventObservable");
        this.numpadEventObservable = numpadEventObservable;
        this.filledCallbacks = filledCallbacks;
        setImeOptionDone(isLastIndex && !isMultiline());
        if (showKeyboardOrNumpadAfterConfig) {
            if (isAttachedToWindow()) {
                if (getUseCustomNumpad()) {
                    requestFocus();
                    this.showNumpadAtBeginningRelay.accept(Boolean.TRUE);
                    return;
                } else {
                    ((Callbacks) requireComponentCallbacks()).keyboardFocusOnEditText(requireEditText());
                    return;
                }
            }
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.odyssey.lib.view.SdBaseInputRow$configInput$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    this.removeOnAttachStateChangeListener(this);
                    if (this.getUseCustomNumpad()) {
                        this.requestFocus();
                        this.showNumpadAtBeginningRelay.accept(Boolean.TRUE);
                    } else {
                        ((SdBaseInputRow.Callbacks) this.requireComponentCallbacks()).keyboardFocusOnEditText(this.requireEditText());
                    }
                }
            });
        }
    }

    public final InitialValueObservable<CharSequence> textChanges() {
        return RxTextView.textChanges(requireEditText());
    }

    protected Observable<Boolean> isFilled() {
        Observable map = RxTextView.textChanges(requireEditText()).map(new Function(this) { // from class: com.robinhood.android.odyssey.lib.view.SdBaseInputRow.isFilled.1
            final /* synthetic */ SdBaseInputRow<T, D, C> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Function
            public final Boolean apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(this.this$0.requireEditText().getTypedText().length() > 0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    protected final RdsGenericTextInput requireEditText() {
        EditText editText = getEditText();
        Intrinsics.checkNotNull(editText);
        return (RdsGenericTextInput) editText;
    }

    private final Observable<Boolean> isFilledOrOptional() {
        Observable observableSwitchMap = this.isInputRequiredRelay.switchMap(new Function(this) { // from class: com.robinhood.android.odyssey.lib.view.SdBaseInputRow.isFilledOrOptional.1
            final /* synthetic */ SdBaseInputRow<T, D, C> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.booleanValue()) {
                    return this.this$0.isFilled();
                }
                Observable observableJust = Observable.just(Boolean.TRUE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    private final void setInputType(ApiSdBaseInputComponentData.InputType inputType) throws Resources.NotFoundException {
        int i = WhenMappings.$EnumSwitchMapping$0[inputType.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                requireEditText().setInputType(getAutoCapTextInputType());
                String string2 = getResources().getString(C20335R.string.sd_input_alphabet_charset);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                requireEditText().setFilters(new CharacterSetInputFilter[]{new CharacterSetInputFilter(StringsKt.toSet(string2), false)});
            } else if (i == 3) {
                requireEditText().setInputType(getAutoCapTextInputType());
                requireEditText().setFilters(new InputFilter[0]);
            } else if (i == 4) {
                requireEditText().setInputType(getAutoCapTextInputType());
                String string3 = getResources().getString(C20335R.string.sd_input_strict_alphanumeric_charset);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                requireEditText().setFilters(new CharacterSetInputFilter[]{new CharacterSetInputFilter(StringsKt.toSet(string3), true)});
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                requireEditText().setInputType(524290);
            }
            z = false;
        } else {
            requireEditText().setInputType(2);
        }
        setUseCustomNumpad(z);
    }

    private final int getAutoCapTextInputType() {
        int i;
        D data = getData();
        ApiSdBaseInputComponentData.AutoCapitalizeType autocapitalize = data != null ? data.getAutocapitalize() : null;
        int i2 = autocapitalize == null ? -1 : WhenMappings.$EnumSwitchMapping$1[autocapitalize.ordinal()];
        if (i2 == -1 || i2 == 1) {
            i = 1;
        } else if (i2 == 2) {
            i = 4096;
        } else if (i2 == 3) {
            i = 8192;
        } else {
            if (i2 != 4) {
                Preconditions.INSTANCE.failUnknownEnumKotlin(autocapitalize);
                throw new ExceptionsH();
            }
            i = 16384;
        }
        return i | 1;
    }

    private final void setMultiline() {
        RdsGenericTextInput rdsGenericTextInputRequireEditText = requireEditText();
        rdsGenericTextInputRequireEditText.setSingleLine(!isMultiline());
        if (isMultiline()) {
            rdsGenericTextInputRequireEditText.setMaxLines(5);
            rdsGenericTextInputRequireEditText.setGravity(MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new InputSavedState(onSaveState(super.onSaveInstanceState()), this.validationEndpointRequired, this.validators);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNull(state, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.view.SdBaseInputRow.InputSavedState");
        InputSavedState inputSavedState = (InputSavedState) state;
        this.validationEndpointRequired = inputSavedState.getValidationEndpointRequired();
        this.validators = inputSavedState.getValidators();
        super.onRestoreInstanceState(onRestoreState(inputSavedState.getSavedState()));
    }

    /* compiled from: SdBaseInputRow.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow$InputSavedState;", "Landroid/os/Parcelable;", "savedState", "validationEndpointRequired", "", "validators", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInputComponentValidator;", "<init>", "(Landroid/os/Parcelable;ZLjava/util/List;)V", "getSavedState", "()Landroid/os/Parcelable;", "getValidationEndpointRequired", "()Z", "getValidators", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class InputSavedState implements Parcelable {
        public static final Parcelable.Creator<InputSavedState> CREATOR = new Creator();
        private final Parcelable savedState;
        private final boolean validationEndpointRequired;
        private final List<ApiSdInputComponentValidator> validators;

        /* compiled from: SdBaseInputRow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InputSavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSavedState createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable parcelable = parcel.readParcelable(InputSavedState.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(parcel.readParcelable(InputSavedState.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new InputSavedState(parcelable, z, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSavedState[] newArray(int i) {
                return new InputSavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.savedState, flags);
            dest.writeInt(this.validationEndpointRequired ? 1 : 0);
            List<ApiSdInputComponentValidator> list = this.validators;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<ApiSdInputComponentValidator> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        public InputSavedState(Parcelable savedState, boolean z, List<ApiSdInputComponentValidator> list) {
            Intrinsics.checkNotNullParameter(savedState, "savedState");
            this.savedState = savedState;
            this.validationEndpointRequired = z;
            this.validators = list;
        }

        public final Parcelable getSavedState() {
            return this.savedState;
        }

        public final boolean getValidationEndpointRequired() {
            return this.validationEndpointRequired;
        }

        public final List<ApiSdInputComponentValidator> getValidators() {
            return this.validators;
        }
    }
}
