package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import com.squareup.workflow1.p415ui.TextController;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.TwoStateViewController;
import kotlin.Metadata;

/* compiled from: AddressValueComponent.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\nJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u000e\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000f8&X¦\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00148&X¦\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00148&X¦\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u00148&X¦\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010!\u001a\u00020\u00148&X¦\u0004¢\u0006\f\u0012\u0004\b \u0010\u0013\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010$\u001a\u00020\u00148&X¦\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0013\u001a\u0004\b\"\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/AddressValueComponent;", "", "", "newState", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "updateCollapsedState", "(Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "", "newString", "updateAddressStreet1", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "updateAddressStreet2", "updateAddressCity", "updateAddressSubdivision", "updateAddressPostalCode", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/TwoStateViewController;", "isAddressFieldCollapsed", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/TwoStateViewController;", "isAddressFieldCollapsed$annotations", "()V", "Lcom/squareup/workflow1/ui/TextController;", "getTextControllerForAddressStreet1", "()Lcom/squareup/workflow1/ui/TextController;", "getTextControllerForAddressStreet1$annotations", "textControllerForAddressStreet1", "getTextControllerForAddressStreet2", "getTextControllerForAddressStreet2$annotations", "textControllerForAddressStreet2", "getTextControllerForAddressCity", "getTextControllerForAddressCity$annotations", "textControllerForAddressCity", "getTextControllerForAddressSubdivision", "getTextControllerForAddressSubdivision$annotations", "textControllerForAddressSubdivision", "getTextControllerForAddressPostalCode", "getTextControllerForAddressPostalCode$annotations", "textControllerForAddressPostalCode", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface AddressValueComponent {
    TextController getTextControllerForAddressCity();

    TextController getTextControllerForAddressPostalCode();

    TextController getTextControllerForAddressStreet1();

    TextController getTextControllerForAddressStreet2();

    TextController getTextControllerForAddressSubdivision();

    /* renamed from: isAddressFieldCollapsed */
    TwoStateViewController getIsAddressFieldCollapsed();

    InputAddressComponent updateAddressCity(String newString);

    InputAddressComponent updateAddressPostalCode(String newString);

    InputAddressComponent updateAddressStreet1(String newString);

    InputAddressComponent updateAddressStreet2(String newString);

    InputAddressComponent updateAddressSubdivision(String newString);

    InputAddressComponent updateCollapsedState(Boolean newState);
}
