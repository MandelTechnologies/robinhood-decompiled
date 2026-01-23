package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.graphics.drawable.ColorDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.workflow1.p415ui.TextController;
import com.squareup.workflow1.p415ui.TextControllerControlEditText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$layout;
import com.withpersona.sdk2.inquiry.steps.p423ui.adapter.StyleableSelectArrayAdapter;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.DateController;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiDateFieldBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.InputSelectStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextInputLayoutStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.ViewUtils5;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputDateComponent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"makeView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "dateController", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/DateController;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputDateComponent2 {
    public static /* synthetic */ ConstraintLayout makeView$default(InputDateComponent inputDateComponent, UiComponentHelper uiComponentHelper, DateController dateController, InputDate inputDate, int i, Object obj) {
        if ((i & 2) != 0) {
            dateController = inputDateComponent.getDateController();
        }
        return makeView(inputDateComponent, uiComponentHelper, dateController, inputDate);
    }

    public static final ConstraintLayout makeView(InputDateComponent inputDateComponent, UiComponentHelper uiComponentHelper, DateController dateController, InputDate config) {
        AttributeStyles.DateSelectBackgroundColorStyle backgroundColor;
        Integer inputSelectBackgroundColor;
        InputSelectComponentStyle inputSelectStyle;
        Intrinsics.checkNotNullParameter(inputDateComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(dateController, "dateController");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiDateFieldBinding pi2UiDateFieldBindingInflate = Pi2UiDateFieldBinding.inflate(uiComponentHelper.getLayoutInflater());
        final InputDate.InputDateComponentStyle styles = config.getStyles();
        InputDate.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            pi2UiDateFieldBindingInflate.dateLabel.setText(attributes.getLabel());
            List<String> textMonths = attributes.getTextMonths();
            if (textMonths == null) {
                textMonths = CollectionsKt.emptyList();
            }
            StyleableSelectArrayAdapter styleableSelectArrayAdapter = new StyleableSelectArrayAdapter(uiComponentHelper.getContext(), R$layout.pi2_ui_date_list_item, textMonths, (styles == null || (inputSelectStyle = styles.getInputSelectStyle()) == null) ? null : inputSelectStyle.getTextBasedStyle());
            TextController monthController = dateController.getMonthController();
            AutoCompleteTextView monthEditText = pi2UiDateFieldBindingInflate.monthEditText;
            Intrinsics.checkNotNullExpressionValue(monthEditText, "monthEditText");
            TextControllerControlEditText.control(monthController, monthEditText);
            pi2UiDateFieldBindingInflate.monthEditText.setAdapter(styleableSelectArrayAdapter);
            if (styles != null && (backgroundColor = styles.getBackgroundColor()) != null && (inputSelectBackgroundColor = backgroundColor.getInputSelectBackgroundColor()) != null) {
                pi2UiDateFieldBindingInflate.monthEditText.setDropDownBackgroundDrawable(new ColorDrawable(inputSelectBackgroundColor.intValue()));
            }
            pi2UiDateFieldBindingInflate.day.setHint(attributes.getPlaceholderDay());
            TextController dayController = dateController.getDayController();
            TextInputEditText dayEditText = pi2UiDateFieldBindingInflate.dayEditText;
            Intrinsics.checkNotNullExpressionValue(dayEditText, "dayEditText");
            TextControllerControlEditText.control(dayController, dayEditText);
            pi2UiDateFieldBindingInflate.year.setHint(attributes.getPlaceholderYear());
            TextController yearController = dateController.getYearController();
            TextInputEditText yearEditText = pi2UiDateFieldBindingInflate.yearEditText;
            Intrinsics.checkNotNullExpressionValue(yearEditText, "yearEditText");
            TextControllerControlEditText.control(yearController, yearEditText);
        }
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputDateComponent2.makeView$lambda$9$lambda$8(styles, pi2UiDateFieldBindingInflate);
            }
        });
        pi2UiDateFieldBindingInflate.getRoot().setTag(pi2UiDateFieldBindingInflate);
        ConstraintLayout root = pi2UiDateFieldBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$9$lambda$8(InputDate.InputDateComponentStyle inputDateComponentStyle, Pi2UiDateFieldBinding pi2UiDateFieldBinding) throws IllegalArgumentException {
        InputTextBasedComponentStyle inputTextStyle;
        InputTextBasedComponentStyle inputTextStyle2;
        InputSelectComponentStyle inputSelectStyle;
        InputSelectComponentStyle inputSelectStyle2;
        TextBasedComponentStyle errorTextStyle;
        InputSelectComponentStyle inputSelectStyle3;
        TextBasedComponentStyle labelStyle;
        AttributeStyles.InputMarginStyle margin;
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        if (inputDateComponentStyle != null && (margin = inputDateComponentStyle.getMargin()) != null && (base = margin.getBase()) != null && (base2 = base.getBase()) != null) {
            ConstraintLayout root = pi2UiDateFieldBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewUtils5.setMargins(root, base2);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle3 = inputDateComponentStyle.getInputSelectStyle()) != null && (labelStyle = inputSelectStyle3.getLabelStyle()) != null) {
            TextView dateLabel = pi2UiDateFieldBinding.dateLabel;
            Intrinsics.checkNotNullExpressionValue(dateLabel, "dateLabel");
            TextStyling2.style$default(dateLabel, labelStyle, null, 2, null);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle2 = inputDateComponentStyle.getInputSelectStyle()) != null && (errorTextStyle = inputSelectStyle2.getErrorTextStyle()) != null) {
            TextView errorLabel = pi2UiDateFieldBinding.errorLabel;
            Intrinsics.checkNotNullExpressionValue(errorLabel, "errorLabel");
            TextStyling2.style$default(errorLabel, errorTextStyle, null, 2, null);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle = inputDateComponentStyle.getInputSelectStyle()) != null) {
            TextInputLayout month = pi2UiDateFieldBinding.month;
            Intrinsics.checkNotNullExpressionValue(month, "month");
            InputSelectStyling.style(month, inputSelectStyle);
        }
        if (inputDateComponentStyle != null && (inputTextStyle2 = inputDateComponentStyle.getInputTextStyle()) != null) {
            TextInputLayout day = pi2UiDateFieldBinding.day;
            Intrinsics.checkNotNullExpressionValue(day, "day");
            TextInputLayoutStyling.style(day, inputTextStyle2);
        }
        if (inputDateComponentStyle != null && (inputTextStyle = inputDateComponentStyle.getInputTextStyle()) != null) {
            TextInputLayout year = pi2UiDateFieldBinding.year;
            Intrinsics.checkNotNullExpressionValue(year, "year");
            TextInputLayoutStyling.style(year, inputTextStyle);
        }
        return Unit.INSTANCE;
    }
}
