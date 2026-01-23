package com.withpersona.sdk2.inquiry.p424ui.network;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.withpersona.sdk2.inquiry.p424ui.network.ComponentParam;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComponentParam.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "toValue", "(Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)Ljava/lang/Object;", "ui_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParamKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ComponentParam2 {
    public static final Object toValue(ComponentParam componentParam) {
        Intrinsics.checkNotNullParameter(componentParam, "<this>");
        if (componentParam instanceof ComponentParam.Address) {
            ComponentParam.Address address = (ComponentParam.Address) componentParam;
            return MapsKt.mapOf(Tuples4.m3642to("street_1", address.getStreet1()), Tuples4.m3642to("street_2", address.getStreet2()), Tuples4.m3642to("city", address.getCity()), Tuples4.m3642to("subdivision", address.getSubdivision()), Tuples4.m3642to(PlaceTypes.POSTAL_CODE, address.getPostalCode()));
        }
        if (componentParam instanceof ComponentParam.ComponentString) {
            return ((ComponentParam.ComponentString) componentParam).getValue();
        }
        if (componentParam instanceof ComponentParam.ComponentStringList) {
            return ((ComponentParam.ComponentStringList) componentParam).getValue();
        }
        if (componentParam instanceof ComponentParam.ComponentBoolean) {
            return Boolean.valueOf(((ComponentParam.ComponentBoolean) componentParam).getValue());
        }
        if (componentParam instanceof ComponentParam.ComponentNumber) {
            return ((ComponentParam.ComponentNumber) componentParam).getValue();
        }
        if (componentParam instanceof ComponentParam.ESignature) {
            String signatureImageString = ((ComponentParam.ESignature) componentParam).getSignatureImageString();
            return signatureImageString == null ? "" : signatureImageString;
        }
        if (componentParam instanceof ComponentParam.GovernmentIdNfcScan) {
            ComponentParam.GovernmentIdNfcScan governmentIdNfcScan = (ComponentParam.GovernmentIdNfcScan) componentParam;
            return MapsKt.mapOf(Tuples4.m3642to("caFlag", governmentIdNfcScan.getChipAuthenticationStatus()), Tuples4.m3642to("dg1", governmentIdNfcScan.getDg1()), Tuples4.m3642to("dg2", governmentIdNfcScan.getDg2()), Tuples4.m3642to("sod", governmentIdNfcScan.getSod()));
        }
        if (!(componentParam instanceof ComponentParam.InternationalDbParams)) {
            throw new NoWhenBranchMatchedException();
        }
        ComponentParam.InternationalDbParams internationalDbParams = (ComponentParam.InternationalDbParams) componentParam;
        return MapsKt.mapOf(Tuples4.m3642to("idb_country", internationalDbParams.getCountry()), Tuples4.m3642to("idb_type", internationalDbParams.getType()), Tuples4.m3642to("idb_value", internationalDbParams.getValue()));
    }
}
