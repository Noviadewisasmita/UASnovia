package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Kambing;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList();
        kucings.add(new Kucing(ctx.getString(R.string.holstein_nama), ctx.getString(R.string.holstein_nama),
                ctx.getString(R.string.holstein_nama), R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.galloway_nama), ctx.getString(R.string.galloway_asal),
                ctx.getString(R.string.galloway_deskripsi), R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.hereford_nama), ctx.getString(R.string.hereford_asal),
                ctx.getString(R.string.hereford_deskripsi), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.cachena_nama), ctx.getString(R.string.cachena_asal),
                ctx.getString(R.string.cachena_deskripsi), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.anggus_nama), ctx.getString(R.string.anggus_asal),
                ctx.getString(R.string.anggus_deskripsi), R.drawable.cat_siam));
        return kucings;
    }

    private static List<Kambing> initDataKambing(Context ctx) {
        List<Kambing> kambings = new ArrayList();
        kambings.add(new Kambing(ctx.getString(R.string.arab_nama), ctx.getString(R.string.arab_asal),
                ctx.getString(R.string.arab_deskripsi), R.drawable.ka1));
        kambings.add(new Kambing(ctx.getString(R.string.appoloosa_nama), ctx.getString(R.string.appoloosa_asal),
                ctx.getString(R.string.appoloosa_deskripsi), R.drawable.ka2));
        kambings.add(new Kambing(ctx.getString(R.string.dutch_nama), ctx.getString(R.string.dutch_asal),
                ctx.getString(R.string.dutch_deskripsi), R.drawable.ka3));
        kambings.add(new Kambing(ctx.getString(R.string.mustang_nama), ctx.getString(R.string.mustang_asal),
                ctx.getString(R.string.mustang_deskripsi), R.drawable.ka4));
        return kambings;
    }
    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList();
        kelincis.add(new Kelinci(ctx.getString(R.string.murrah_nama), ctx.getString(R.string.murrah_asal),
                ctx.getString(R.string.murrah_deskripsi), R.drawable.kelinci_netherland_dwarf));
        kelincis.add(new Kelinci(ctx.getString(R.string.rawa_nama), ctx.getString(R.string.rawa_asal),
                ctx.getString(R.string.rawa_deskripsi), R.drawable.kelinci_orictolagus_cuniculus));
        kelincis.add(new Kelinci(ctx.getString(R.string.mediterania_nama), ctx.getString(R.string.mediterania_asal),
                ctx.getString(R.string.mediterania_deskripsi), R.drawable.kelinci_holland_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.nagfuri_nama), ctx.getString(R.string.nagfuri_asal),
                ctx.getString(R.string.nagfuri_deskripsi), R.drawable.kelinci_mini_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.surti_nama), ctx.getString(R.string.surti_asal),
                ctx.getString(R.string.surti_deskripsi), R.drawable.kelinci_raksasa));

        return kelincis;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataKambing(ctx));
        hewans.addAll(initDataKelinci(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
