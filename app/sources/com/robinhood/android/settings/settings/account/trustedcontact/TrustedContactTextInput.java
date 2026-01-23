package com.robinhood.android.settings.settings.account.trustedcontact;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroup2;
import androidx.customview.view.AbsSavedState;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.settings.settings.C28321R;
import com.robinhood.android.settings.settings.databinding.MergeTrustedContactTextInputBinding;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: TrustedContactTextInput.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001>B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001fJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0016\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0014\u0010,\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020$0.J\u000e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u000201J\u0016\u00102\u001a\u00020$2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0014J\u0016\u00106\u001a\u00020$2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0014J\b\u00107\u001a\u000205H\u0014J\u0010\u00108\u001a\u00020$2\u0006\u00109\u001a\u000205H\u0014J\u001a\u0010:\u001a\u00020$*\u00020;2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\u0012\u0010=\u001a\b\u0012\u0004\u0012\u00020504*\u00020;H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R(\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R(\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactTextInput;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/settings/settings/databinding/MergeTrustedContactTextInputBinding;", "getBinding", "()Lcom/robinhood/android/settings/settings/databinding/MergeTrustedContactTextInputBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "value", "", "hintText", "getHintText", "()Ljava/lang/CharSequence;", "setHintText", "(Ljava/lang/CharSequence;)V", "titleText", "getTitleText", "setTitleText", "text", "getText", "setText", "trailingText", "getTrailingText", "setTrailingText", "textChanges", "Lcom/jakewharton/rxbinding3/InitialValueObservable;", "focusChanges", "Lio/reactivex/Observable;", "", "setInternationalInfo", "", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/android/common/util/InternationalInfo;", "applyError", "error", "Lcom/robinhood/models/api/ErrorResponse;", "fieldName", "", "onTrailingButtonClicked", "block", "Lkotlin/Function0;", "bindTrustedContactField", "field", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactField;", "dispatchSaveInstanceState", "container", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "dispatchRestoreInstanceState", "onSaveInstanceState", "onRestoreInstanceState", "state", "restoreChildViewStates", "Landroid/view/ViewGroup;", "childViewStates", "saveChildViewStates", "SavedState", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class TrustedContactTextInput extends ConstraintLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TrustedContactTextInput.class, "binding", "getBinding()Lcom/robinhood/android/settings/settings/databinding/MergeTrustedContactTextInputBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private CharSequence hintText;
    private CharSequence text;
    private CharSequence titleText;
    private CharSequence trailingText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactTextInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, TrustedContactTextInput2.INSTANCE);
        ViewGroups.inflate(this, C28321R.layout.merge_trusted_contact_text_input, true);
        int[] TrustedContactTextInput = C28321R.styleable.TrustedContactTextInput;
        Intrinsics.checkNotNullExpressionValue(TrustedContactTextInput, "TrustedContactTextInput");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TrustedContactTextInput, 0, 0);
        setTitleText(typedArrayObtainStyledAttributes.getText(C28321R.styleable.TrustedContactTextInput_titleText));
        setHintText(typedArrayObtainStyledAttributes.getText(C28321R.styleable.TrustedContactTextInput_hintText));
        typedArrayObtainStyledAttributes.recycle();
        setClipToPadding(false);
        setClipChildren(false);
    }

    public /* synthetic */ TrustedContactTextInput(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final MergeTrustedContactTextInputBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeTrustedContactTextInputBinding) value;
    }

    public final CharSequence getHintText() {
        return this.hintText;
    }

    public final void setHintText(CharSequence charSequence) {
        this.hintText = charSequence;
        getBinding().trustedContactInputEditText.setHint(charSequence);
    }

    public final CharSequence getTitleText() {
        return this.titleText;
    }

    public final void setTitleText(CharSequence charSequence) {
        this.titleText = charSequence;
        getBinding().trustedContactInputTextTitle.setText(charSequence);
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final void setText(CharSequence charSequence) {
        this.text = charSequence;
        getBinding().trustedContactInputEditText.setText(this.text);
    }

    public final CharSequence getTrailingText() {
        return this.trailingText;
    }

    public final void setTrailingText(CharSequence charSequence) {
        this.trailingText = charSequence;
        getBinding().trustedContactInputTextTrailingButton.setText(charSequence);
    }

    public final InitialValueObservable<CharSequence> textChanges() {
        RdsFormattedEditText trustedContactInputEditText = getBinding().trustedContactInputEditText;
        Intrinsics.checkNotNullExpressionValue(trustedContactInputEditText, "trustedContactInputEditText");
        return RxTextView.textChanges(trustedContactInputEditText);
    }

    public final Observable<Boolean> focusChanges() {
        return getBinding().trustedContactInputEditText.focusChanges();
    }

    public final void setInternationalInfo(InternationalInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        getBinding().trustedContactInputEditText.setTemplate(info.getCountryCodePhoneNumberTemplate(), info.getCountryCodePhoneNumberHint());
    }

    public final void applyError(ErrorResponse error, String fieldName) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        RdsTextInputContainerView trustedContactInputContainer = getBinding().trustedContactInputContainer;
        Intrinsics.checkNotNullExpressionValue(trustedContactInputContainer, "trustedContactInputContainer");
        Views.applyError(trustedContactInputContainer, error, fieldName);
    }

    public final void onTrailingButtonClicked(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        RhTextView trustedContactInputTextTrailingButton = getBinding().trustedContactInputTextTrailingButton;
        Intrinsics.checkNotNullExpressionValue(trustedContactInputTextTrailingButton, "trustedContactInputTextTrailingButton");
        OnClickListeners.onClick(trustedContactInputTextTrailingButton, block);
    }

    public final void bindTrustedContactField(TrustedContactField field) {
        Intrinsics.checkNotNullParameter(field, "field");
        RdsFormattedEditText rdsFormattedEditText = getBinding().trustedContactInputEditText;
        rdsFormattedEditText.setInputType(field.getInputTypeFlags());
        rdsFormattedEditText.setUseCustomNumpad(field.isPhoneNumber());
        if (Build.VERSION.SDK_INT >= 26) {
            rdsFormattedEditText.setImportantForAutofill(1);
            String[] strArr = (String[]) field.getAutofillHints().toArray(new String[0]);
            rdsFormattedEditText.setAutofillHints((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        Intrinsics.checkNotNullParameter(container, "container");
        dispatchFreezeSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        Intrinsics.checkNotNullParameter(container, "container");
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNull(parcelableOnSaveInstanceState);
        return new SavedState(parcelableOnSaveInstanceState, saveChildViewStates(this));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof SavedState) {
            SavedState savedState = (SavedState) state;
            super.onRestoreInstanceState(savedState.getSuperState());
            restoreChildViewStates(this, savedState.getChildrenStates());
            return;
        }
        super.onRestoreInstanceState(state);
    }

    private final void restoreChildViewStates(ViewGroup viewGroup, SparseArray<Parcelable> sparseArray) {
        Iterator<View> it = ViewGroup2.getChildren(viewGroup).iterator2();
        while (it.hasNext()) {
            it.next().restoreHierarchyState(sparseArray);
        }
    }

    private final SparseArray<Parcelable> saveChildViewStates(ViewGroup viewGroup) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        Iterator<View> it = ViewGroup2.getChildren(viewGroup).iterator2();
        while (it.hasNext()) {
            it.next().saveHierarchyState(sparseArray);
        }
        return sparseArray;
    }

    /* compiled from: TrustedContactTextInput.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactTextInput$SavedState;", "Landroidx/customview/view/AbsSavedState;", "inSuperState", "Landroid/os/Parcelable;", "childrenStates", "Landroid/util/SparseArray;", "<init>", "(Landroid/os/Parcelable;Landroid/util/SparseArray;)V", "getInSuperState", "()Landroid/os/Parcelable;", "getChildrenStates", "()Landroid/util/SparseArray;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SavedState extends AbsSavedState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final SparseArray<Parcelable> childrenStates;
        private final Parcelable inSuperState;

        /* compiled from: TrustedContactTextInput.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable parcelable = parcel.readParcelable(SavedState.class.getClassLoader());
                int i = parcel.readInt();
                SparseArray sparseArray = new SparseArray(i);
                while (i != 0) {
                    sparseArray.put(parcel.readInt(), parcel.readParcelable(SavedState.class.getClassLoader()));
                    i--;
                }
                return new SavedState(parcelable, sparseArray);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SavedState copy$default(SavedState savedState, Parcelable parcelable, SparseArray sparseArray, int i, Object obj) {
            if ((i & 1) != 0) {
                parcelable = savedState.inSuperState;
            }
            if ((i & 2) != 0) {
                sparseArray = savedState.childrenStates;
            }
            return savedState.copy(parcelable, sparseArray);
        }

        /* renamed from: component1, reason: from getter */
        public final Parcelable getInSuperState() {
            return this.inSuperState;
        }

        public final SparseArray<Parcelable> component2() {
            return this.childrenStates;
        }

        public final SavedState copy(Parcelable inSuperState, SparseArray<Parcelable> childrenStates) {
            Intrinsics.checkNotNullParameter(inSuperState, "inSuperState");
            Intrinsics.checkNotNullParameter(childrenStates, "childrenStates");
            return new SavedState(inSuperState, childrenStates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) other;
            return Intrinsics.areEqual(this.inSuperState, savedState.inSuperState) && Intrinsics.areEqual(this.childrenStates, savedState.childrenStates);
        }

        public int hashCode() {
            return (this.inSuperState.hashCode() * 31) + this.childrenStates.hashCode();
        }

        public String toString() {
            return "SavedState(inSuperState=" + this.inSuperState + ", childrenStates=" + this.childrenStates + ")";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.inSuperState, flags);
            SparseArray<Parcelable> sparseArray = this.childrenStates;
            int size = sparseArray.size();
            dest.writeInt(size);
            for (int i = 0; i != size; i++) {
                dest.writeInt(sparseArray.keyAt(i));
                dest.writeParcelable(sparseArray.valueAt(i), flags);
            }
        }

        public final Parcelable getInSuperState() {
            return this.inSuperState;
        }

        public final SparseArray<Parcelable> getChildrenStates() {
            return this.childrenStates;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable inSuperState, SparseArray<Parcelable> childrenStates) {
            super(inSuperState);
            Intrinsics.checkNotNullParameter(inSuperState, "inSuperState");
            Intrinsics.checkNotNullParameter(childrenStates, "childrenStates");
            this.inSuperState = inSuperState;
            this.childrenStates = childrenStates;
        }
    }
}
