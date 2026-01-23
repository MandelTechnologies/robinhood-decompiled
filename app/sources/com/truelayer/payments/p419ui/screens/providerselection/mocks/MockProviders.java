package com.truelayer.payments.p419ui.screens.providerselection.mocks;

import android.content.Context;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.p481io.ReadWrite2;
import kotlin.text.Charsets;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json4;
import kotlinx.serialization.json.Json6;

/* compiled from: MockProviders.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"json", "Lkotlinx/serialization/json/Json;", "mockProviders", "", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "appContext", "Landroid/content/Context;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.providerselection.mocks.MockProvidersKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MockProviders {
    private static final Json json = Json6.Json$default(null, new Function1<Json4, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.mocks.MockProvidersKt$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Json4 json4) {
            invoke2(json4);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Json4 Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
        }
    }, 1, null);

    public static final List<PaymentProvider> mockProviders(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        try {
            InputStream inputStreamOpen = appContext.getAssets().open("mockProviders.json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
            try {
                String text = ReadWrite2.readText(bufferedReader);
                Unit unit = Unit.INSTANCE;
                Closeable.closeFinally(bufferedReader, null);
                Json json2 = json;
                json2.getSerializersModule();
                return (List) json2.decodeFromString(new ArrayListSerializer(PaymentProvider.INSTANCE.serializer()), text);
            } finally {
            }
        } catch (Throwable unused) {
            return CollectionsKt.emptyList();
        }
    }
}
