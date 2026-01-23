package io.bitdrift.capture.attributes;

import android.content.Context;
import android.os.Build;
import androidx.core.os.ConfigurationCompat;
import io.bitdrift.capture.providers.FieldProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceAttributes.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\bH\u0096\u0002J\u0006\u0010\t\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lio/bitdrift/capture/attributes/DeviceAttributes;", "Lio/bitdrift/capture/providers/FieldProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "invoke", "", "", "Lio/bitdrift/capture/providers/Fields;", "model", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DeviceAttributes implements FieldProvider {
    private final Context context;

    public DeviceAttributes(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final String model() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    @Override // io.bitdrift.capture.providers.FieldProvider, kotlin.jvm.functions.Function0
    public Map<String, ? extends String> invoke() {
        return MapsKt.mapOf(Tuples4.m3642to("model", model()), Tuples4.m3642to("_locale", String.valueOf(ConfigurationCompat.getLocales(this.context.getResources().getConfiguration()).get(0))));
    }
}
