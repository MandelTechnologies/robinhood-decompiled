package microgram.android.internal.guest.p485js;

import com.robinhood.android.tracing.RhTrace;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.utils.logging.CrashReporter;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElement7;
import kotlinx.serialization.json.JsonElementBuilders;
import kotlinx.serialization.json.JsonElementBuilders2;
import microgram.RuntimeInfo;
import microgram.android.internal.json.JsonFlatten;
import microgram.manifest.AppInfo;
import microgram.manifest.DeployJson;

/* compiled from: MicrogramJs.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/android/internal/guest/js/MicrogramJs;", "", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lkotlinx/serialization/json/Json;)V", "generateInjectedScript", "", "runtimeInfo", "Lmicrogram/RuntimeInfo;", "appInfo", "Lmicrogram/manifest/AppInfo;", "generateSentryInitBlock", "performanceMarkDetail", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class MicrogramJs {
    private final Json json;

    public MicrogramJs(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.json = json;
    }

    public final String generateInjectedScript(RuntimeInfo runtimeInfo, AppInfo appInfo) {
        Intrinsics.checkNotNullParameter(runtimeInfo, "runtimeInfo");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        String strGenerateSentryInitBlock = generateSentryInitBlock(runtimeInfo, appInfo);
        boolean zIsEnabled = RhTrace.INSTANCE.isEnabled();
        Json json = this.json;
        json.getSerializersModule();
        return StringsKt.trimIndent("\n        var startTimestamp = performance.now();\n        " + strGenerateSentryInitBlock + "\n        const microgramTracingEnabled = " + zIsEnabled + ";\n        \n        window.addEventListener(\"error\", event => {\n          const error = event.error;\n          if (error instanceof Error) {\n            const serialError = {\n                \"name\": error.name,\n                \"message\": error.message,\n                \"fileName\": error.fileName,\n                \"lineNumber\": error.lineNumber,\n                \"stack\": error.stack,\n            };\n            const serialEvent = {\"type\": \"error\", \"error\": serialError};\n            const json = JSON.stringify(serialEvent);\n            _microgramEntryPoint.postMessage(json);\n          }\n        });\n        \n        const microgramRuntimeInfo = " + json.encodeToString(RuntimeInfo.INSTANCE.serializer(), runtimeInfo) + ";\n        \n        const globalChannel = new MessageChannel();\n        \n        function microgramTransportSendMessage(message, completionHandler) {\n          var channel = new MessageChannel();\n          channel.port1.onmessage = function (event) {\n            try {\n              code = parseInt(event.data);\n              if (completionHandler) {\n                  completionHandler(code);\n              }\n            } finally {\n              channel.port1.close();\n            }\n          };\n          globalChannel.port1.postMessage(message, [channel.port2]);\n        }\n        \n        function microgramRegisterGlobalMessageHandler(handler) {\n          globalChannel.port1.onmessage = function(inboundMessage) {\n            const replyPort = inboundMessage.ports[0];\n            try {\n              const code = handler(inboundMessage.data);\n              replyPort.postMessage(code.toString());\n            } finally {\n              replyPort.close();\n            }\n          };\n        }\n        \n        _microgramEntryPoint.postMessage(JSON.stringify({\"type\": \"init\"}), [globalChannel.port2]);\n        performance.measure(\"MicrogramJS.init\", {\n            \"start\": startTimestamp,\n            \"detail\": " + performanceMarkDetail(runtimeInfo, appInfo) + ",\n        });\n    ");
    }

    private final String generateSentryInitBlock(final RuntimeInfo runtimeInfo, final AppInfo appInfo) {
        if (!appInfo.getExtraSecure()) {
            JsonElementBuilders2 jsonElementBuilders2 = new JsonElementBuilders2();
            JsonElementBuilders.put(jsonElementBuilders2, "dsn", "https://e59161206eb816852c8e3430d6ba9377@o62437.ingest.sentry.io/4505635863068672");
            JsonElementBuilders.put(jsonElementBuilders2, "release", appInfo.getIdentifier() + "@" + appInfo.getVersion());
            JsonElementBuilders.put(jsonElementBuilders2, "tracesSampleRate", (Number) 0);
            JsonElementBuilders.put(jsonElementBuilders2, "replaysSessionSampleRate", (Number) 0);
            JsonElementBuilders.put(jsonElementBuilders2, "replaysOnErrorSampleRate", (Number) 0);
            Json deployJson = DeployJson.getDeployJson();
            RuntimeInfo.ReleaseVariant releaseVariant = runtimeInfo.getReleaseVariant();
            deployJson.getSerializersModule();
            JsonElement jsonElementEncodeToJsonElement = deployJson.encodeToJsonElement(RuntimeInfo.ReleaseVariant.INSTANCE.serializer(), releaseVariant);
            Intrinsics.checkNotNull(jsonElementEncodeToJsonElement, "null cannot be cast to non-null type kotlinx.serialization.json.JsonPrimitive");
            JsonElementBuilders.put(jsonElementBuilders2, "environment", ((JsonElement7) jsonElementEncodeToJsonElement).getContent());
            JsonElementBuilders.putJsonObject(jsonElementBuilders2, "initialScope", new Function1() { // from class: microgram.android.internal.guest.js.MicrogramJs$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MicrogramJs.generateSentryInitBlock$lambda$3$lambda$2(runtimeInfo, appInfo, (JsonElementBuilders2) obj);
                }
            });
            JsonElement6 jsonElement6Build = jsonElementBuilders2.build();
            Json json = this.json;
            json.getSerializersModule();
            return "Sentry.init(" + json.encodeToString(JsonElement6.INSTANCE.serializer(), jsonElement6Build) + ");";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateSentryInitBlock$lambda$3$lambda$2(final RuntimeInfo runtimeInfo, final AppInfo appInfo, JsonElementBuilders2 putJsonObject) {
        Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
        JsonElementBuilders.putJsonObject(putJsonObject, "user", new Function1() { // from class: microgram.android.internal.guest.js.MicrogramJs$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MicrogramJs.generateSentryInitBlock$lambda$3$lambda$2$lambda$0((JsonElementBuilders2) obj);
            }
        });
        JsonElementBuilders.putJsonObject(putJsonObject, "tags", new Function1() { // from class: microgram.android.internal.guest.js.MicrogramJs$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MicrogramJs.generateSentryInitBlock$lambda$3$lambda$2$lambda$1(runtimeInfo, appInfo, (JsonElementBuilders2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateSentryInitBlock$lambda$3$lambda$2$lambda$0(JsonElementBuilders2 putJsonObject) {
        Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
        JsonElementBuilders.put(putJsonObject, "id", CrashReporter.INSTANCE.getUserIdentifier());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateSentryInitBlock$lambda$3$lambda$2$lambda$1(RuntimeInfo runtimeInfo, AppInfo appInfo, JsonElementBuilders2 putJsonObject) {
        Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
        Json.Companion companion = Json.INSTANCE;
        companion.getSerializersModule();
        JsonFlatten.flattenTo(companion.encodeToJsonElement(RuntimeInfo.INSTANCE.serializer(), runtimeInfo), putJsonObject, CollectionsKt.listOf((Object[]) new String[]{Constants.DID_MIGRATE_EVENT_TO_SDID_DEBUG_PARAM, "rt"}));
        JsonElementBuilders.put(putJsonObject, "mg.app.identifier", appInfo.getIdentifier());
        JsonElementBuilders.put(putJsonObject, "mg.app.version", appInfo.getVersion().toString());
        JsonElementBuilders.put(putJsonObject, "mg.app.build", appInfo.getBuild());
        return Unit.INSTANCE;
    }

    private final String performanceMarkDetail(final RuntimeInfo runtimeInfo, final AppInfo appInfo) {
        Json json = this.json;
        JsonElementBuilders2 jsonElementBuilders2 = new JsonElementBuilders2();
        JsonElementBuilders.putJsonObject(jsonElementBuilders2, ErrorResponse.DETAIL, new Function1() { // from class: microgram.android.internal.guest.js.MicrogramJs$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MicrogramJs.performanceMarkDetail$lambda$5$lambda$4(this.f$0, runtimeInfo, appInfo, (JsonElementBuilders2) obj);
            }
        });
        JsonElement6 jsonElement6Build = jsonElementBuilders2.build();
        json.getSerializersModule();
        return json.encodeToString(JsonElement6.INSTANCE.serializer(), jsonElement6Build);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performanceMarkDetail$lambda$5$lambda$4(MicrogramJs microgramJs, RuntimeInfo runtimeInfo, AppInfo appInfo, JsonElementBuilders2 putJsonObject) {
        Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
        Json json = microgramJs.json;
        json.getSerializersModule();
        putJsonObject.put("runtimeInfo", json.encodeToJsonElement(RuntimeInfo.INSTANCE.serializer(), runtimeInfo));
        Json json2 = microgramJs.json;
        json2.getSerializersModule();
        putJsonObject.put("appInfo", json2.encodeToJsonElement(AppInfo.INSTANCE.serializer(), appInfo));
        return Unit.INSTANCE;
    }
}
