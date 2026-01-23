package com.truelayer.payments.p419ui.components.inputs.form;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.ViewModel;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.p419ui.components.inputs.form.models.Field;
import com.truelayer.payments.p419ui.components.inputs.form.models.FieldState;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: FormViewModel.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/truelayer/payments/ui/components/inputs/form/FormViewModel;", "Landroidx/lifecycle/ViewModel;", "fields", "", "Lcom/truelayer/payments/ui/components/inputs/form/models/Field;", "(Ljava/util/List;)V", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getFields", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "state", "Lcom/truelayer/payments/ui/components/inputs/form/FormState;", "getState", "()Lcom/truelayer/payments/ui/components/inputs/form/FormState;", "onChange", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "Lcom/truelayer/payments/ui/components/inputs/form/models/FieldState;", "validate", "touched", "", "values", "", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FormViewModel extends ViewModel {
    public static final int $stable = 0;
    private final SnapshotStateList<Field> fields;

    public FormViewModel(List<? extends Field> fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.fields = SnapshotStateKt.toMutableStateList(fields);
    }

    public final SnapshotStateList<Field> getFields() {
        return this.fields;
    }

    public final FormViewModel2 getState() {
        boolean z = false;
        List listValidate$default = validate$default(this, false, 1, null);
        boolean z2 = listValidate$default instanceof Collection;
        if (!z2 || !listValidate$default.isEmpty()) {
            Iterator it = listValidate$default.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Field field = (Field) it.next();
                if (field.getValidation().getMandatory() && (field.getState() instanceof FieldState.Clean)) {
                    z = true;
                    break;
                }
            }
        }
        if (!z2 || !listValidate$default.isEmpty()) {
            Iterator it2 = listValidate$default.iterator();
            while (it2.hasNext()) {
                if (((Field) it2.next()).getState() instanceof FieldState.Invalid) {
                    return FormViewModel2.InValid;
                }
            }
        }
        if (z) {
            return FormViewModel2.Incomplete;
        }
        return FormViewModel2.Valid;
    }

    public final Map<String, String> values() {
        SnapshotStateList<Field> snapshotStateList = this.fields;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(snapshotStateList, 10)), 16));
        for (Field field : snapshotStateList) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(field.getId(), StringsKt.trim(field.getValue()).toString());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return linkedHashMap;
    }

    public static /* synthetic */ List validate$default(FormViewModel formViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return formViewModel.validate(z);
    }

    public final List<Field> validate(boolean touched) {
        SnapshotStateList<Field> snapshotStateList = this.fields;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(snapshotStateList, 10));
        for (Field field : snapshotStateList) {
            arrayList.add(Fields3.copy$default(field, null, null, null, null, null, Field.validate$default(field, null, touched, 1, null), false, null, null, null, null, null, 4063, null));
        }
        return arrayList;
    }

    public final Outcome<Unit, Throwable> onChange(int index, FieldState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        try {
            SnapshotStateList<Field> snapshotStateList = this.fields;
            snapshotStateList.set(index, Fields3.copy$default(snapshotStateList.get(index), null, null, null, null, null, state, false, null, null, null, null, null, 4063, null));
            return new Ok(Unit.INSTANCE);
        } catch (Throwable th) {
            return new Fail(th);
        }
    }
}
