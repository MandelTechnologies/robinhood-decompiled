package com.robinhood.android.debitcard.linking.p098ui;

import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.core.view.ViewGroup2;
import com.google.android.material.textfield.TextInputLayout;
import com.robinhood.android.debitcard.linking.C13894R;
import com.stripe.android.R$id;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardParams;
import com.stripe.android.view.CardInputWidget;
import com.stripe.android.view.CardValidCallback;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Action;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CardInputWidgets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0003\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\bH\u0002¨\u0006\t"}, m3636d2 = {"streamIsValid", "Lio/reactivex/Observable;", "", "Lcom/stripe/android/view/CardInputWidget;", "limitPostalCodeToFiveCharacters", "", "preventSoftInputOnFocus", "announceAutoFocusChange", "Landroid/view/ViewGroup;", "feature-debit-card-linking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.debitcard.linking.ui.CardInputWidgetsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CardInputWidgets {
    public static final Observable<Boolean> streamIsValid(final CardInputWidget cardInputWidget) {
        Intrinsics.checkNotNullParameter(cardInputWidget, "<this>");
        Observable<Boolean> observableDoOnDispose = Observable.create(new ObservableOnSubscribe() { // from class: com.robinhood.android.debitcard.linking.ui.CardInputWidgetsKt.streamIsValid.1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<Boolean> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                final CardInputWidget cardInputWidget2 = cardInputWidget;
                cardInputWidget2.setCardValidCallback(new CardValidCallback() { // from class: com.robinhood.android.debitcard.linking.ui.CardInputWidgetsKt.streamIsValid.1.1
                    @Override // com.stripe.android.view.CardValidCallback
                    public final void onInputChanged(boolean z, Set<? extends CardValidCallback.Fields> set) {
                        CardParams cardParams;
                        Address address;
                        String postalCode;
                        Intrinsics.checkNotNullParameter(set, "<unused var>");
                        if (emitter.getDisposed()) {
                            return;
                        }
                        emitter.onNext(Boolean.valueOf((!z || (cardParams = cardInputWidget2.getCardParams()) == null || (address = cardParams.getAddress()) == null || (postalCode = address.getPostalCode()) == null || postalCode.length() != 5) ? false : true));
                    }
                });
            }
        }).doOnDispose(new Action() { // from class: com.robinhood.android.debitcard.linking.ui.CardInputWidgetsKt.streamIsValid.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                cardInputWidget.setCardValidCallback(null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnDispose, "doOnDispose(...)");
        return observableDoOnDispose;
    }

    public static final void limitPostalCodeToFiveCharacters(CardInputWidget cardInputWidget) {
        Intrinsics.checkNotNullParameter(cardInputWidget, "<this>");
        EditText editText = (EditText) cardInputWidget.findViewById(R$id.postal_code_edit_text);
        InputFilter[] filters = editText.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        editText.setFilters((InputFilter[]) ArraysKt.plus((InputFilter.LengthFilter[]) filters, new InputFilter.LengthFilter(5)));
    }

    public static final void preventSoftInputOnFocus(CardInputWidget cardInputWidget) {
        Intrinsics.checkNotNullParameter(cardInputWidget, "<this>");
        View viewFindViewById = cardInputWidget.findViewById(R$id.container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        preventSoftInputOnFocus((ViewGroup) viewFindViewById);
    }

    public static final void announceAutoFocusChange(final CardInputWidget cardInputWidget) {
        Intrinsics.checkNotNullParameter(cardInputWidget, "<this>");
        final String string2 = cardInputWidget.getResources().getString(C13894R.string.accessibility_form_input_auto_change_focus_warning);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        ((EditText) cardInputWidget.findViewById(R$id.card_number_edit_text)).setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.robinhood.android.debitcard.linking.ui.CardInputWidgetsKt.announceAutoFocusChange.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(event, "event");
                super.onInitializeAccessibilityEvent(host, event);
                if (event.getEventType() == 32768) {
                    cardInputWidget.announceForAccessibility(string2);
                }
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.addAction(new AccessibilityNodeInfo.AccessibilityAction(1, string2));
            }
        });
    }

    private static final void preventSoftInputOnFocus(ViewGroup viewGroup) {
        for (View view : ViewGroup2.getChildren(viewGroup)) {
            if (view instanceof TextInputLayout) {
                EditText editText = ((TextInputLayout) view).getEditText();
                if (editText != null) {
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.setShowSoftInputOnFocus(false);
                    editText.setInputType(2);
                }
            } else if (view instanceof ViewGroup) {
                preventSoftInputOnFocus((ViewGroup) view);
            } else if (view instanceof EditText) {
                EditText editText2 = (EditText) view;
                editText2.setFocusable(true);
                editText2.setFocusableInTouchMode(true);
                editText2.setShowSoftInputOnFocus(false);
                editText2.setInputType(2);
            }
        }
    }
}
