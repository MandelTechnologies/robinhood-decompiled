package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroup2;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.odyssey.lib.view.SdBaseInputRow;
import com.robinhood.android.odyssey.lib.view.SdDropdownSelectRow;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseInputComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdCheckboxComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdDropdownSelectComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdInputComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPhoneInputComponent;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.Preconditions;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdInputsContainerView.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dJ\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0016H\u0016J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u001aH\u0014J\b\u0010$\u001a\u00020\u001aH\u0014J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0002H\u0014J\u0018\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0017H\u0014J\u0018\u0010+\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\rH\u0002J\u0018\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020.2\u0006\u0010'\u001a\u00020\u0017H\u0002J$\u0010/\u001a\u00020\u001a2\u0012\u0010-\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003002\u0006\u0010'\u001a\u00020\u0017H\u0002J\u0018\u00101\u001a\u00020\u001a2\u0006\u0010-\u001a\u0002022\u0006\u0010'\u001a\u00020\u0017H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\r0\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017`\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdInputsContainerView;", "Lcom/robinhood/android/odyssey/lib/view/SdLinearLayout;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseInputComponent;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow$FilledCallbacks;", "Lcom/robinhood/android/odyssey/lib/view/SdDropdownSelectRow$ContainerCallbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isFilledList", "", "", "areAllRequiredFieldsFilledRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "numpadEventPublishRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Landroid/view/KeyEvent;", "tagToIndex", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "setNumpadEvents", "", "keyEvent", "areAllRequiredFieldsFilled", "Lio/reactivex/Observable;", "isInputFilledOrOptional", "isFilled", "tag", "isOptionSelected", "isSelected", "doBeforeAddingChildren", "doAfterAddingChildren", "inflateChild", "Landroid/view/View;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "component", "doAfterRestoringOrBindingChildState", "view", "setRowIsFilled", "configDropdownSelect", "row", "Lcom/robinhood/android/odyssey/lib/view/SdDropdownSelectRow;", "configInput", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow;", "configCheckbox", "Lcom/robinhood/android/odyssey/lib/view/SdCheckboxRow;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdInputsContainerView extends SdLinearLayout<ApiSdBaseInputComponent> implements SdBaseInputRow.FilledCallbacks, SdDropdownSelectRow.ContainerCallbacks {
    public static final int $stable = 8;
    private final BehaviorRelay<Boolean> areAllRequiredFieldsFilledRelay;
    private List<Boolean> isFilledList;
    private final PublishRelay<KeyEvent> numpadEventPublishRelay;
    private final HashMap<String, Integer> tagToIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdInputsContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        BehaviorRelay<Boolean> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.areAllRequiredFieldsFilledRelay = behaviorRelayCreateDefault;
        PublishRelay<KeyEvent> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.numpadEventPublishRelay = publishRelayCreate;
        this.tagToIndex = new HashMap<>();
    }

    public final void setNumpadEvents(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        this.numpadEventPublishRelay.accept(keyEvent);
    }

    public final Observable<Boolean> areAllRequiredFieldsFilled() {
        Observable<Boolean> observableHide = this.areAllRequiredFieldsFilledRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow.FilledCallbacks
    public void isInputFilledOrOptional(boolean isFilled, String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Integer num = this.tagToIndex.get(tag);
        Intrinsics.checkNotNull(num);
        setRowIsFilled(num.intValue(), isFilled);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdDropdownSelectRow.ContainerCallbacks
    public void isOptionSelected(boolean isSelected, String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Integer num = this.tagToIndex.get(tag);
        Intrinsics.checkNotNull(num);
        setRowIsFilled(num.intValue(), isSelected);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdLinearLayout
    protected void doBeforeAddingChildren() {
        super.doBeforeAddingChildren();
        List<ApiSdBaseInputComponent> content = getContent();
        Intrinsics.checkNotNull(content);
        int size = content.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(Boolean.FALSE);
        }
        this.isFilledList = arrayList;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdLinearLayout
    protected void doAfterAddingChildren() {
        super.doAfterAddingChildren();
        for (View view : ViewGroup2.getChildren(this)) {
            if (view instanceof SdCheckboxRow) {
                SdCheckboxRow sdCheckboxRow = (SdCheckboxRow) view;
                sdCheckboxRow.setIsReadyForCheckEvent(true);
                Integer num = this.tagToIndex.get(sdCheckboxRow.getTag());
                Intrinsics.checkNotNull(num);
                setRowIsFilled(num.intValue(), true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.view.SdLinearLayout
    public View inflateChild(int index, ApiSdBaseInputComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        if (component instanceof ApiSdInputComponent) {
            return SdInputRow.INSTANCE.inflate((ViewGroup) this);
        }
        if (component instanceof ApiSdPhoneInputComponent) {
            return SdPhoneInputRowWithInternationalInfo.INSTANCE.inflate((ViewGroup) this);
        }
        if (component instanceof ApiSdDropdownSelectComponent) {
            return SdDropdownSelectRow.INSTANCE.inflate((ViewGroup) this);
        }
        if (component instanceof ApiSdCheckboxComponent) {
            return SdCheckboxRow.INSTANCE.inflate((ViewGroup) this);
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(component);
        throw new ExceptionsH();
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdLinearLayout
    protected void doAfterRestoringOrBindingChildState(View view, int index) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.doAfterRestoringOrBindingChildState(view, index);
        if (view instanceof SdInputRow) {
            configInput((SdBaseInputRow) view, index);
            return;
        }
        if (view instanceof SdPhoneInputRowWithInternationalInfo) {
            configInput(((SdPhoneInputRowWithInternationalInfo) view).getPhoneInputRow(), index);
        } else if (view instanceof SdDropdownSelectRow) {
            configDropdownSelect((SdDropdownSelectRow) view, index);
        } else if (view instanceof SdCheckboxRow) {
            configCheckbox((SdCheckboxRow) view, index);
        }
    }

    private final void setRowIsFilled(int index, boolean isFilled) {
        List<Boolean> list = this.isFilledList;
        List<Boolean> list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("isFilledList");
            list = null;
        }
        synchronized (list) {
            try {
                List<Boolean> list3 = this.isFilledList;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("isFilledList");
                    list3 = null;
                }
                list3.set(index, Boolean.valueOf(isFilled));
                BehaviorRelay<Boolean> behaviorRelay = this.areAllRequiredFieldsFilledRelay;
                List<Boolean> list4 = this.isFilledList;
                if (list4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("isFilledList");
                } else {
                    list2 = list4;
                }
                List<Boolean> list5 = list2;
                boolean z = true;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    Iterator<T> it = list5.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (!((Boolean) it.next()).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                behaviorRelay.accept(Boolean.valueOf(z));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void configDropdownSelect(SdDropdownSelectRow row, int index) {
        HashMap<String, Integer> map = this.tagToIndex;
        Object tag = row.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
        map.put((String) tag, Integer.valueOf(index));
        row.setOptionSelectedCallbacks(this);
    }

    private final void configInput(SdBaseInputRow<?, ?, ?> row, int index) {
        HashMap<String, Integer> map = this.tagToIndex;
        Object tag = row.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
        map.put((String) tag, Integer.valueOf(index));
        PublishRelay<KeyEvent> publishRelay = this.numpadEventPublishRelay;
        boolean z = index == 0;
        List<ApiSdBaseInputComponent> content = getContent();
        Intrinsics.checkNotNull(content);
        row.configInput(publishRelay, z, index == CollectionsKt.getLastIndex(content), this);
    }

    private final void configCheckbox(SdCheckboxRow row, int index) {
        HashMap<String, Integer> map = this.tagToIndex;
        Object tag = row.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
        map.put((String) tag, Integer.valueOf(index));
    }
}
