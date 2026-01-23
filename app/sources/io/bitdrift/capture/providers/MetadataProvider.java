package io.bitdrift.capture.providers;

import android.util.Log;
import io.bitdrift.capture.ErrorHandler;
import io.bitdrift.capture.IMetadataProvider;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MetadataProvider.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00110\u0005j\u0002`\u0012H\u0016J \u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00110\u0005j\u0002`\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0012\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00110\u0005j\u0002`\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lio/bitdrift/capture/providers/MetadataProvider;", "Lio/bitdrift/capture/IMetadataProvider;", "dateProvider", "Lio/bitdrift/capture/providers/DateProvider;", "ootbFieldProviders", "", "Lio/bitdrift/capture/providers/FieldProvider;", "customFieldProviders", "errorHandler", "Lio/bitdrift/capture/ErrorHandler;", "errorLog", "Lkotlin/Function2;", "", "", "", "(Lio/bitdrift/capture/providers/DateProvider;Ljava/util/List;Ljava/util/List;Lio/bitdrift/capture/ErrorHandler;Lkotlin/jvm/functions/Function2;)V", "customFields", "Lio/bitdrift/capture/providers/Field;", "Lio/bitdrift/capture/InternalFieldsList;", "fields", "fieldProviders", "ootbFields", "timestamp", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class MetadataProvider implements IMetadataProvider {
    private final List<FieldProvider> customFieldProviders;
    private final DateProvider dateProvider;
    private final ErrorHandler errorHandler;
    private final Function2<String, Throwable, Unit> errorLog;
    private final List<FieldProvider> ootbFieldProviders;

    /* JADX WARN: Multi-variable type inference failed */
    public MetadataProvider(DateProvider dateProvider, List<? extends FieldProvider> ootbFieldProviders, List<? extends FieldProvider> customFieldProviders, ErrorHandler errorHandler, Function2<? super String, ? super Throwable, Unit> errorLog) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(ootbFieldProviders, "ootbFieldProviders");
        Intrinsics.checkNotNullParameter(customFieldProviders, "customFieldProviders");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(errorLog, "errorLog");
        this.dateProvider = dateProvider;
        this.ootbFieldProviders = ootbFieldProviders;
        this.customFieldProviders = customFieldProviders;
        this.errorHandler = errorHandler;
        this.errorLog = errorLog;
    }

    public /* synthetic */ MetadataProvider(DateProvider dateProvider, List list, List list2, ErrorHandler errorHandler, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dateProvider, list, list2, errorHandler, (i & 16) != 0 ? new Function2<String, Throwable, Unit>() { // from class: io.bitdrift.capture.providers.MetadataProvider.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Throwable th) {
                invoke2(str, th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String message, Throwable throwable) {
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Log.w("capture", message, throwable);
            }
        } : function2);
    }

    @Override // io.bitdrift.capture.IMetadataProvider
    public long timestamp() {
        return ((Date) this.dateProvider.invoke()).getTime();
    }

    @Override // io.bitdrift.capture.IMetadataProvider
    public List<Field> ootbFields() {
        return fields(this.ootbFieldProviders);
    }

    @Override // io.bitdrift.capture.IMetadataProvider
    public List<Field> customFields() {
        return fields(this.customFieldProviders);
    }

    private final List<Field> fields(List<? extends FieldProvider> fieldProviders) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (FieldProvider fieldProvider : fieldProviders) {
            try {
                Map<String, ? extends String> mapInvoke = fieldProvider.invoke();
                ArrayList arrayList = new ArrayList(mapInvoke.size());
                for (Map.Entry<String, ? extends String> entry : mapInvoke.entrySet()) {
                    arrayList.add(new Field(entry.getKey(), FieldProvider3.toFieldValue(entry.getValue())));
                }
                listCreateListBuilder.addAll(arrayList);
            } catch (Throwable th) {
                String str = "Field Provider \"" + fieldProvider.getClass().getName() + "\" threw an exception";
                this.errorLog.invoke(str, th);
                this.errorHandler.handleError(str, th);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
