package io.bitdrift.capture;

import io.bitdrift.capture.providers.Field;
import java.util.List;
import kotlin.Metadata;

/* compiled from: IMetadataProvider.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H&J\u0012\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lio/bitdrift/capture/IMetadataProvider;", "", "customFields", "", "Lio/bitdrift/capture/providers/Field;", "Lio/bitdrift/capture/InternalFieldsList;", "ootbFields", "timestamp", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface IMetadataProvider {
    List<Field> customFields();

    List<Field> ootbFields();

    long timestamp();
}
