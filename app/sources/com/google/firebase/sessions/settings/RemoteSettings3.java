package com.google.firebase.sessions.settings;

import android.util.Log;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RemoteSettings.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", m3645f = "RemoteSettings.kt", m3646l = {125, 128, 131, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, 136}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1, reason: use source file name */
/* loaded from: classes.dex */
final class RemoteSettings3 extends ContinuationImpl7 implements Function2<JSONObject, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteSettings3(RemoteSettings remoteSettings, Continuation<? super RemoteSettings3> continuation) {
        super(2, continuation);
        this.this$0 = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemoteSettings3 remoteSettings3 = new RemoteSettings3(this.this$0, continuation);
        remoteSettings3.L$0 = obj;
        return remoteSettings3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(JSONObject jSONObject, Continuation<? super Unit> continuation) {
        return ((RemoteSettings3) create(jSONObject, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0154, code lost:
    
        if (r13.updateSessionCacheDuration(r0, r12) == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0195, code lost:
    
        if (r13.updateSessionCacheUpdatedTime(r0, r12) == r4) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
    /* JADX WARN: Type inference failed for: r13v12, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws JSONException {
        Ref.ObjectRef objectRef;
        Boolean bool;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Unit unit;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                JSONObject jSONObject = (JSONObject) this.L$0;
                Log.d("SessionConfigFetcher", "Fetched settings: " + jSONObject);
                Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                if (jSONObject.has("app_quality")) {
                    Object obj2 = jSONObject.get("app_quality");
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    try {
                        bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                    } catch (JSONException e) {
                        e = e;
                        bool = null;
                    }
                    try {
                        if (jSONObject2.has("sampling_rate")) {
                            objectRef6.element = (Double) jSONObject2.get("sampling_rate");
                        }
                        if (jSONObject2.has("session_timeout_seconds")) {
                            objectRef.element = (Integer) jSONObject2.get("session_timeout_seconds");
                        }
                        if (jSONObject2.has("cache_duration")) {
                            objectRef7.element = (Integer) jSONObject2.get("cache_duration");
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                        if (bool == null) {
                        }
                    }
                } else {
                    bool = null;
                }
                if (bool == null) {
                    SettingsCache settingsCache = this.this$0.getSettingsCache();
                    this.L$0 = objectRef6;
                    this.L$1 = objectRef;
                    this.L$2 = objectRef7;
                    this.label = 1;
                    if (settingsCache.updateSettingsEnabled(bool, this) != coroutine_suspended) {
                        objectRef4 = objectRef6;
                        objectRef5 = objectRef;
                        objectRef3 = objectRef7;
                        objectRef = objectRef5;
                        objectRef2 = objectRef4;
                        if (((Integer) objectRef.element) != null) {
                            SettingsCache settingsCache2 = this.this$0.getSettingsCache();
                            Integer num = (Integer) objectRef.element;
                            this.L$0 = objectRef2;
                            this.L$1 = objectRef3;
                            this.L$2 = null;
                            this.label = 2;
                            if (settingsCache2.updateSessionRestartTimeout(num, this) != coroutine_suspended) {
                            }
                        }
                        if (((Double) objectRef2.element) != null) {
                            SettingsCache settingsCache3 = this.this$0.getSettingsCache();
                            Double d = (Double) objectRef2.element;
                            this.L$0 = objectRef3;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            if (settingsCache3.updateSamplingRate(d, this) != coroutine_suspended) {
                            }
                        }
                        if (((Integer) objectRef3.element) != null) {
                            SettingsCache settingsCache4 = this.this$0.getSettingsCache();
                            Integer num2 = (Integer) objectRef3.element;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                            break;
                        } else {
                            unit = null;
                            if (unit == null) {
                                SettingsCache settingsCache5 = this.this$0.getSettingsCache();
                                Integer numBoxInt = boxing.boxInt(OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 5;
                                if (settingsCache5.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                }
                            }
                            SettingsCache settingsCache6 = this.this$0.getSettingsCache();
                            Long lBoxLong = boxing.boxLong(System.currentTimeMillis());
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                            break;
                        }
                    }
                    return coroutine_suspended;
                }
                objectRef2 = objectRef6;
                objectRef3 = objectRef7;
                if (((Integer) objectRef.element) != null) {
                }
                if (((Double) objectRef2.element) != null) {
                }
                if (((Integer) objectRef3.element) != null) {
                }
            case 1:
                objectRef3 = (Ref.ObjectRef) this.L$2;
                objectRef5 = (Ref.ObjectRef) this.L$1;
                objectRef4 = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                objectRef = objectRef5;
                objectRef2 = objectRef4;
                if (((Integer) objectRef.element) != null) {
                }
                if (((Double) objectRef2.element) != null) {
                }
                if (((Integer) objectRef3.element) != null) {
                }
                break;
            case 2:
                objectRef3 = (Ref.ObjectRef) this.L$1;
                objectRef2 = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Double) objectRef2.element) != null) {
                }
                if (((Integer) objectRef3.element) != null) {
                }
                break;
            case 3:
                objectRef3 = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Integer) objectRef3.element) != null) {
                }
                break;
            case 4:
                ResultKt.throwOnFailure(obj);
                unit = Unit.INSTANCE;
                if (unit == null) {
                }
                SettingsCache settingsCache62 = this.this$0.getSettingsCache();
                Long lBoxLong2 = boxing.boxLong(System.currentTimeMillis());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                break;
            case 5:
                ResultKt.throwOnFailure(obj);
                SettingsCache settingsCache622 = this.this$0.getSettingsCache();
                Long lBoxLong22 = boxing.boxLong(System.currentTimeMillis());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                break;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
