package com.robinhood.android.microgramsdui.control;

import com.robinhood.models.serverdriven.experimental.api.ComponentState;
import com.robinhood.models.serverdriven.experimental.api.SelectRowState;
import com.robinhood.models.serverdriven.experimental.api.TableInstrumentNameState;
import com.robinhood.models.serverdriven.experimental.api.TextAreaState;
import com.robinhood.models.serverdriven.experimental.api.TextInputState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement6;
import microgram.p507ui.sdui.SduiComponentState;
import microgram.p507ui.sdui.SduiComponentStateType;
import microgram.p507ui.sdui.SduiSelectRowState;
import microgram.p507ui.sdui.SduiTableInstrumentNameState;
import microgram.p507ui.sdui.SduiTextAreaState;
import microgram.p507ui.sdui.SduiTextInputState;

/* compiled from: LegacyUiController.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "", "Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.LegacyUiController$notifyScreenStatesUpdated$mappedStates$1", m3645f = "LegacyUiController.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
final class LegacyUiController$notifyScreenStatesUpdated$mappedStates$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends JsonElement6>>, Object> {
    final /* synthetic */ Map<String, ComponentState> $states;
    int label;
    final /* synthetic */ LegacyUiController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LegacyUiController$notifyScreenStatesUpdated$mappedStates$1(Map<String, ? extends ComponentState> map, LegacyUiController legacyUiController, Continuation<? super LegacyUiController$notifyScreenStatesUpdated$mappedStates$1> continuation) {
        super(2, continuation);
        this.$states = map;
        this.this$0 = legacyUiController;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LegacyUiController$notifyScreenStatesUpdated$mappedStates$1(this.$states, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends JsonElement6>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Map<String, JsonElement6>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, JsonElement6>> continuation) {
        return ((LegacyUiController$notifyScreenStatesUpdated$mappedStates$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        SduiComponentState sduiTextInputState;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Map<String, ComponentState> map = this.$states;
        LegacyUiController legacyUiController = this.this$0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ComponentState componentState = (ComponentState) entry.getValue();
            Json json = legacyUiController.json;
            if (componentState instanceof SelectRowState) {
                sduiTextInputState = new SduiSelectRowState((SduiComponentStateType) null, ((SelectRowState) componentState).getSelected(), 1, (DefaultConstructorMarker) null);
            } else if (componentState instanceof TableInstrumentNameState) {
                sduiTextInputState = new SduiTableInstrumentNameState(((TableInstrumentNameState) componentState).getCollapse_progress(), (SduiComponentStateType) null, 2, (DefaultConstructorMarker) null);
            } else if (componentState instanceof TextAreaState) {
                sduiTextInputState = new SduiTextAreaState((SduiComponentStateType) null, ((TextAreaState) componentState).getText(), 1, (DefaultConstructorMarker) null);
            } else {
                if (!(componentState instanceof TextInputState)) {
                    throw new NoWhenBranchMatchedException();
                }
                sduiTextInputState = new SduiTextInputState((SduiComponentStateType) null, ((TextInputState) componentState).getText(), 1, (DefaultConstructorMarker) null);
            }
            json.getSerializersModule();
            JsonElement jsonElementEncodeToJsonElement = json.encodeToJsonElement(SduiComponentState.INSTANCE.serializer(), sduiTextInputState);
            Intrinsics.checkNotNull(jsonElementEncodeToJsonElement, "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
            linkedHashMap.put(key, (JsonElement6) jsonElementEncodeToJsonElement);
        }
        return linkedHashMap;
    }
}
