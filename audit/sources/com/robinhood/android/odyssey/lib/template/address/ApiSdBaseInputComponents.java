package com.robinhood.android.odyssey.lib.template.address;

import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseInputComponent;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiSdBaseInputComponents.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"findAddressComponentById", "T", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseInputComponent;", "", "id", "", "(Ljava/util/List;Ljava/lang/String;)Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseInputComponent;", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.odyssey.lib.template.address.ApiSdBaseInputComponentsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class ApiSdBaseInputComponents {
    public static final <T extends ApiSdBaseInputComponent> T findAddressComponentById(List<? extends ApiSdBaseInputComponent> list, String id) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        for (Object obj : list) {
            T t = (T) obj;
            if (Intrinsics.areEqual(t.getData().getId(), id)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of com.robinhood.android.odyssey.lib.template.address.ApiSdBaseInputComponentsKt.findAddressComponentById");
                return t;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
