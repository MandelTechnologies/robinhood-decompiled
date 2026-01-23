package com.squareup.workflow1.p415ui;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: TypedViewRegistry.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B%\b\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\b\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\tJ1\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u000b*\u00020\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/squareup/workflow1/ui/TypedViewRegistry;", "Lcom/squareup/workflow1/ui/ViewRegistry;", "", "Lkotlin/reflect/KClass;", "Lcom/squareup/workflow1/ui/ViewFactory;", "bindings", "<init>", "(Ljava/util/Map;)V", "", "([Lcom/squareup/workflow1/ui/ViewFactory;)V", "", "RenderingT", "renderingType", "getFactoryFor", "(Lkotlin/reflect/KClass;)Lcom/squareup/workflow1/ui/ViewFactory;", "Ljava/util/Map;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TypedViewRegistry implements ViewRegistry {
    private final Map<KClass<?>, ViewFactory<?>> bindings;

    /* JADX WARN: Multi-variable type inference failed */
    private TypedViewRegistry(Map<KClass<?>, ? extends ViewFactory<?>> map) {
        this.bindings = map;
    }

    @Override // com.squareup.workflow1.p415ui.ViewRegistry
    public <RenderingT> ViewFactory<RenderingT> getFactoryFor(KClass<? extends RenderingT> renderingType) {
        Intrinsics.checkNotNullParameter(renderingType, "renderingType");
        Object obj = this.bindings.get(renderingType);
        if (obj instanceof ViewFactory) {
            return (ViewFactory) obj;
        }
        return null;
    }

    public TypedViewRegistry(ViewFactory<?>... bindings) {
        Intrinsics.checkNotNullParameter(bindings, "bindings");
        ArrayList arrayList = new ArrayList(bindings.length);
        int length = bindings.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            ViewFactory<?> viewFactory = bindings[i2];
            i2++;
            arrayList.add(Tuples4.m3642to(viewFactory.getType(), viewFactory));
        }
        Map map = MapsKt.toMap(arrayList);
        if (map.keySet().size() == bindings.length) {
            this((Map<KClass<?>, ? extends ViewFactory<?>>) map);
            return;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(bindings.length);
        int length2 = bindings.length;
        while (i < length2) {
            ViewFactory<?> viewFactory2 = bindings[i];
            i++;
            arrayList2.add(viewFactory2.getType());
        }
        sb.append(arrayList2);
        sb.append(" must not have duplicate entries.");
        throw new IllegalStateException(sb.toString().toString());
    }
}
