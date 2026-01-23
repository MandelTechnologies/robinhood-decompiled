package com.truelayer.payments.p419ui.components.inputs.form;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.truelayer.payments.p419ui.components.inputs.form.models.Field;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormViewModel.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¨\u0006\u0005"}, m3636d2 = {"formViewModel", "Landroidx/lifecycle/ViewModelProvider$Factory;", "fields", "", "Lcom/truelayer/payments/ui/components/inputs/form/models/Field;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.components.inputs.form.FormViewModelKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FormViewModel3 {
    public static final ViewModelProvider.Factory formViewModel(final List<? extends Field> fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new ViewModelProvider.Factory() { // from class: com.truelayer.payments.ui.components.inputs.form.FormViewModelKt.formViewModel.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new FormViewModel(fields);
            }
        };
    }
}
