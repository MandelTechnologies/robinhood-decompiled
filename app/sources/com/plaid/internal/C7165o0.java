package com.plaid.internal;

import android.app.Application;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
import kotlinx.serialization.json.Json;

/* renamed from: com.plaid.internal.o0 */
/* loaded from: classes16.dex */
public final class C7165o0 implements InterfaceC5944Q4 {

    /* renamed from: a */
    public final Application f3037a;

    /* renamed from: b */
    public final C7165o0 f3038b = this;

    /* renamed from: c */
    public final Factory f3039c;

    /* renamed from: d */
    public final Provider<C5807B5> f3040d;

    /* renamed from: e */
    public final Provider<Json> f3041e;

    /* renamed from: f */
    public final Provider<C7248x1> f3042f;

    /* renamed from: g */
    public final Provider<AbstractC6050c1> f3043g;

    /* renamed from: h */
    public final Provider<C5935P4> f3044h;

    /* renamed from: i */
    public final Provider<WorkflowDatabase> f3045i;

    /* renamed from: j */
    public final Provider<C7258y2> f3046j;

    /* renamed from: k */
    public final Provider<C5816C5> f3047k;

    /* renamed from: l */
    public final Provider<C7252x5> f3048l;

    /* renamed from: m */
    public final Provider<C7077f5> f3049m;

    /* renamed from: n */
    public final Provider<C5988V4> f3050n;

    /* renamed from: o */
    public final Provider<C5861H5> f3051o;

    /* renamed from: p */
    public final Provider<C6030a1> f3052p;

    public C7165o0(C7117j5 c7117j5, Application application) {
        this.f3037a = application;
        DoubleCheck.provider(new C7179p5(c7117j5));
        Factory factoryCreate = InstanceFactory.create(application);
        this.f3039c = factoryCreate;
        Provider<C5807B5> provider = DoubleCheck.provider(new C7233v5(c7117j5, factoryCreate));
        this.f3040d = provider;
        Provider<Json> provider2 = DoubleCheck.provider(new C7188q5(c7117j5));
        this.f3041e = provider2;
        this.f3042f = DoubleCheck.provider(new C7257y1(provider, provider2));
        Provider<AbstractC6050c1> provider3 = DoubleCheck.provider(new C7170o5(c7117j5, factoryCreate));
        this.f3043g = provider3;
        this.f3044h = DoubleCheck.provider(new C7206s5(c7117j5, provider));
        this.f3045i = DoubleCheck.provider(new C7152m5(c7117j5, factoryCreate));
        this.f3046j = DoubleCheck.provider(new C7197r5(c7117j5));
        Provider<C5816C5> provider4 = DoubleCheck.provider(new C7242w5(c7117j5, factoryCreate));
        this.f3047k = provider4;
        Provider<C7252x5> provider5 = DoubleCheck.provider(new C7224u5(c7117j5, provider4));
        this.f3048l = provider5;
        Provider<C7077f5> provider6 = DoubleCheck.provider(new C7215t5(c7117j5, factoryCreate));
        this.f3049m = provider6;
        this.f3050n = DoubleCheck.provider(new C7135l5(c7117j5, factoryCreate, provider5, provider6));
        this.f3051o = DoubleCheck.provider(new C5870I5(factoryCreate));
        this.f3052p = DoubleCheck.provider(new C7161n5(c7117j5, provider3));
    }
}
