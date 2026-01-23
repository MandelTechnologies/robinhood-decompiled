package com.truelayer.payments.p419ui.screens;

import androidx.compose.runtime.Composer;
import com.truelayer.payments.core.domain.payments.FormInput;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.p419ui.components.inputs.form.models.Field;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields3;
import com.truelayer.payments.p419ui.components.inputs.form.models.ValidationError;
import com.truelayer.payments.p419ui.screens.FormInputWrapper;
import com.truelayer.payments.p419ui.screens.formflows.model.SelectOption;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Screen.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\u0010\u001a\u00020\u000f*\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001ai\u0010\u0010\u001a\u00020\u000f*\u00020\u00122\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2&\b\u0002\u0010\u0018\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00170\u00160\u00150\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0019\u001ai\u0010\u0010\u001a\u00020\u000f*\u00020\u001a2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2&\b\u0002\u0010\u0018\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00170\u00160\u00150\fH\u0000¢\u0006\u0004\b\u0010\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\u0000*\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "Lcom/truelayer/payments/core/domain/payments/FormInput;", "input", "Lcom/truelayer/payments/ui/screens/LastInputError;", "lastError", "copy", "(Lcom/truelayer/payments/ui/screens/FormInputWrapper;Lcom/truelayer/payments/core/domain/payments/FormInput;Lcom/truelayer/payments/ui/screens/LastInputError;)Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "Lcom/truelayer/payments/ui/screens/FormInputWrapper$Select;", "Lkotlin/Function0;", "", "header", Footer.f10637type, "", "Lcom/truelayer/payments/ui/screens/formflows/model/SelectOption;", "recentlyUsedOptions", "Lcom/truelayer/payments/ui/components/inputs/form/models/Field;", "intoField", "(Lcom/truelayer/payments/ui/screens/FormInputWrapper$Select;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/util/List;)Lcom/truelayer/payments/ui/components/inputs/form/models/Field;", "Lcom/truelayer/payments/ui/screens/FormInputWrapper$Text;", "", "recentlyUsedValues", "Lkotlin/Function1;", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/ui/components/inputs/form/models/ValidationError;", "extraValidationFunctions", "(Lcom/truelayer/payments/ui/screens/FormInputWrapper$Text;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/util/List;Ljava/util/List;)Lcom/truelayer/payments/ui/components/inputs/form/models/Field;", "Lcom/truelayer/payments/ui/screens/FormInputWrapper$TextWithImage;", "(Lcom/truelayer/payments/ui/screens/FormInputWrapper$TextWithImage;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/util/List;Ljava/util/List;)Lcom/truelayer/payments/ui/components/inputs/form/models/Field;", "intoFormInputWrapper", "(Lcom/truelayer/payments/core/domain/payments/FormInput;Lcom/truelayer/payments/ui/screens/LastInputError;)Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ScreenKt {
    public static /* synthetic */ FormInputWrapper copy$default(FormInputWrapper formInputWrapper, FormInput formInput, LastInputError lastInputError, int i, Object obj) {
        if ((i & 1) != 0) {
            formInput = formInputWrapper.getInput();
        }
        if ((i & 2) != 0) {
            lastInputError = formInputWrapper.getLastError();
        }
        return copy(formInputWrapper, formInput, lastInputError);
    }

    public static final FormInputWrapper copy(FormInputWrapper formInputWrapper, FormInput input, LastInputError lastInputError) {
        Intrinsics.checkNotNullParameter(formInputWrapper, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (formInputWrapper instanceof FormInputWrapper.Select) {
            return ((FormInputWrapper.Select) formInputWrapper).copy((FormInput.Select) input, lastInputError);
        }
        if (formInputWrapper instanceof FormInputWrapper.Text) {
            return ((FormInputWrapper.Text) formInputWrapper).copy((FormInput.Text) input, lastInputError);
        }
        if (formInputWrapper instanceof FormInputWrapper.TextWithImage) {
            return ((FormInputWrapper.TextWithImage) formInputWrapper).copy((FormInput.TextWithImage) input, lastInputError);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Field intoField$default(FormInputWrapper.Select select, Function2 function2, Function2 function22, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = ComposableSingletons$ScreenKt.INSTANCE.m27084getLambda1$payments_ui_release();
        }
        if ((i & 2) != 0) {
            function22 = ComposableSingletons$ScreenKt.INSTANCE.m27085getLambda2$payments_ui_release();
        }
        return intoField(select, function2, function22, list);
    }

    public static final Field intoField(FormInputWrapper.Select select, Function2<? super Composer, ? super Integer, Unit> header, Function2<? super Composer, ? super Integer, Unit> footer, List<SelectOption> recentlyUsedOptions) {
        Intrinsics.checkNotNullParameter(select, "<this>");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(recentlyUsedOptions, "recentlyUsedOptions");
        return Fields3.intoField$default(select.getInput(), select.getLastError(), (List) null, recentlyUsedOptions, header, footer, 2, (Object) null);
    }

    public static /* synthetic */ Field intoField$default(FormInputWrapper.Text text, Function2 function2, Function2 function22, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = ComposableSingletons$ScreenKt.INSTANCE.m27086getLambda3$payments_ui_release();
        }
        if ((i & 2) != 0) {
            function22 = ComposableSingletons$ScreenKt.INSTANCE.m27087getLambda4$payments_ui_release();
        }
        if ((i & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return intoField(text, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (List<String>) list, (List<? extends Function1<? super String, ? extends Outcome<String, ? extends ValidationError>>>) list2);
    }

    public static final Field intoField(FormInputWrapper.Text text, Function2<? super Composer, ? super Integer, Unit> header, Function2<? super Composer, ? super Integer, Unit> footer, List<String> recentlyUsedValues, List<? extends Function1<? super String, ? extends Outcome<String, ? extends ValidationError>>> extraValidationFunctions) {
        Intrinsics.checkNotNullParameter(text, "<this>");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(recentlyUsedValues, "recentlyUsedValues");
        Intrinsics.checkNotNullParameter(extraValidationFunctions, "extraValidationFunctions");
        return Fields3.intoField(text.getInput(), text.getLastError(), recentlyUsedValues, extraValidationFunctions, header, footer);
    }

    public static /* synthetic */ Field intoField$default(FormInputWrapper.TextWithImage textWithImage, Function2 function2, Function2 function22, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = ComposableSingletons$ScreenKt.INSTANCE.m27088getLambda5$payments_ui_release();
        }
        if ((i & 2) != 0) {
            function22 = ComposableSingletons$ScreenKt.INSTANCE.m27089getLambda6$payments_ui_release();
        }
        if ((i & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return intoField(textWithImage, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (List<String>) list, (List<? extends Function1<? super String, ? extends Outcome<String, ? extends ValidationError>>>) list2);
    }

    public static final Field intoField(FormInputWrapper.TextWithImage textWithImage, Function2<? super Composer, ? super Integer, Unit> header, Function2<? super Composer, ? super Integer, Unit> footer, List<String> recentlyUsedValues, List<? extends Function1<? super String, ? extends Outcome<String, ? extends ValidationError>>> extraValidationFunctions) {
        Intrinsics.checkNotNullParameter(textWithImage, "<this>");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(recentlyUsedValues, "recentlyUsedValues");
        Intrinsics.checkNotNullParameter(extraValidationFunctions, "extraValidationFunctions");
        return Fields3.intoField(textWithImage.getInput(), textWithImage.getLastError(), recentlyUsedValues, extraValidationFunctions, header, footer);
    }

    public static /* synthetic */ FormInputWrapper intoFormInputWrapper$default(FormInput formInput, LastInputError lastInputError, int i, Object obj) {
        if ((i & 1) != 0) {
            lastInputError = null;
        }
        return intoFormInputWrapper(formInput, lastInputError);
    }

    public static final FormInputWrapper intoFormInputWrapper(FormInput formInput, LastInputError lastInputError) {
        Intrinsics.checkNotNullParameter(formInput, "<this>");
        if (formInput instanceof FormInput.Select) {
            return new FormInputWrapper.Select((FormInput.Select) formInput, lastInputError);
        }
        if (formInput instanceof FormInput.Text) {
            return new FormInputWrapper.Text((FormInput.Text) formInput, lastInputError);
        }
        if (formInput instanceof FormInput.TextWithImage) {
            return new FormInputWrapper.TextWithImage((FormInput.TextWithImage) formInput, lastInputError);
        }
        throw new NoWhenBranchMatchedException();
    }
}
